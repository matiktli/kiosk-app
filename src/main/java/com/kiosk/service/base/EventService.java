package com.kiosk.service.base;

import com.kiosk.dao.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService extends BaseService {

    @Autowired
    private EventRepo eventRepo;

}
