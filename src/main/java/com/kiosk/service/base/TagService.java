package com.kiosk.service.base;

import com.kiosk.dao.TagRepo;
import com.kiosk.model.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TagService extends BaseService<Tag> {

    @Autowired
    public TagService(TagRepo repo) {
        super(repo);
    }
}
