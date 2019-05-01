package com.kiosk.service.base;

import com.kiosk.dao.RoomBookingRepo;
import com.kiosk.model.RoomBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomBookingService extends BaseService<RoomBooking> {

    @Autowired
    private RoomBookingRepo roomBookingRepo;

}
