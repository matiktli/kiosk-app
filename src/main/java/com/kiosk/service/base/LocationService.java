package com.kiosk.service.base;

import com.kiosk.dao.LocationRepo;
import com.kiosk.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService extends BaseService<Location> {

    @Autowired
    public LocationService(LocationRepo repo) {
        super(repo);
    }
}
