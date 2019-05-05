package com.kiosk.service.base;

import com.kiosk.dao.LogRepo;
import com.kiosk.model.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService extends BaseService<Log> {

    @Autowired
    public LogService(LogRepo repo) {
        super(repo);
    }
}
