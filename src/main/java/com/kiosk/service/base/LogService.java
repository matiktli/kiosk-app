package com.kiosk.service.base;

import com.kiosk.dao.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService extends BaseService {

    @Autowired
    private LogRepo logRepo;

}
