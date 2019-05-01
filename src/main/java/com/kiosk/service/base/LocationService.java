package com.kiosk.service.base;

import com.kiosk.dao.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService extends BaseService {

    @Autowired
    private LocationRepo locationRepo;

}
