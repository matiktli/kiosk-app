package com.kiosk.service.base;

import com.kiosk.dao.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService extends BaseService {

    @Autowired
    private TagRepo tagRepo;

}
