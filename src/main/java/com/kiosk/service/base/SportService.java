package com.kiosk.service.base;

import com.kiosk.dao.SportRepo;
import com.kiosk.model.Sport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportService extends BaseService<Sport> {

    @Autowired
    private SportRepo sportRepo;

}
