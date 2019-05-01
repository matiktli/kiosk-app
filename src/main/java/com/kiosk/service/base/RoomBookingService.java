package com.kiosk.service.base;

import com.kiosk.dao.RoomBookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomBookingService extends BaseService {

    @Autowired
    private RoomBookingRepo roomBookingRepo;

}
