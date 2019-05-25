package com.kiosk.service.base;

import com.kiosk.dao.RoomBookingRepo;
import com.kiosk.exception.ObjectNotFoundException;
import com.kiosk.exception.RoomBookingException;
import com.kiosk.model.Room;
import com.kiosk.model.RoomBooking;
import io.micrometer.core.lang.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import static com.kiosk.handler.ErrorUtils.MSG_PARAM_OBJECT_NOT_FOUND;
import static com.kiosk.handler.ErrorUtils.MSG_PARAM_ROOM_NOT_AVAILABLE;

@Service
public class RoomBookingService extends BaseService<RoomBooking> {

    private final RoomService roomService;

    @Autowired
    public RoomBookingService(RoomBookingRepo repo, RoomService roomService) {
        super(repo);
        this.roomService = roomService;
    }

    public RoomBooking createBooking(RoomBooking roomBookingRequest) {
        Room roomToBook = roomService.findById(roomBookingRequest.getRoom().getId())
                .orElseThrow(() -> new ObjectNotFoundException(String.format(MSG_PARAM_OBJECT_NOT_FOUND, RoomBooking.class.getSimpleName(), roomBookingRequest.getId())));
        if (!checkIfRoomAvailable(roomToBook.getId(), roomBookingRequest.getStartDate(), roomBookingRequest.getEndDate())) {
            throw new RoomBookingException(String.format(MSG_PARAM_ROOM_NOT_AVAILABLE, roomBookingRequest.getId(), roomBookingRequest.getStartDate(), roomBookingRequest.getEndDate()));
        }
        return save(roomBookingRequest);
    }

    public RoomBooking updateBooking(Integer roomBookingId, RoomBooking roomBookingRequest) {
        if (!findById(roomBookingId).isPresent()) {
            throw new ObjectNotFoundException(String.format(MSG_PARAM_OBJECT_NOT_FOUND, RoomBooking.class.getSimpleName(), roomBookingId));
        }
        return createBooking(roomBookingRequest);
    }

    public boolean checkIfRoomAvailable(Integer roomId, Timestamp fromDate, Timestamp toDate) {
        List<RoomBooking> bookingsInThisTime = findAllBookingsForRoom(roomId, fromDate, toDate);
        return bookingsInThisTime.isEmpty();
    }

    public List<RoomBooking> findAllBookingsForRoom(Integer roomId, @Nullable Timestamp fromDate, @Nullable Timestamp toDate) {
        List<RoomBooking> result = repo.findAll().stream()
                .filter(booking -> booking.getRoom().getId().equals(roomId))
                .collect(Collectors.toList());
        if (fromDate != null) {
            result = result.stream().filter(booking -> booking.getStartDate().after(fromDate)).collect(Collectors.toList());
        }
        if (toDate != null) {
            result = result.stream().filter(booking -> booking.getEndDate().before(toDate)).collect(Collectors.toList());
        }
        return result;
    }
}
