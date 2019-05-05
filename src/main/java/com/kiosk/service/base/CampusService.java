package com.kiosk.service.base;

import com.kiosk.dao.CampusRepo;
import com.kiosk.model.Campus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampusService extends BaseService<Campus> {

    @Autowired
    public CampusService(CampusRepo repo) {
        super(repo);
    }

}
