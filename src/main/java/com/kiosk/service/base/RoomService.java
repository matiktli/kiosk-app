package com.kiosk.service.base;

import com.kiosk.dao.RoomRepo;
import com.kiosk.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService extends BaseService<Room> {

    @Autowired
    private RoomRepo roomRepo;

}
