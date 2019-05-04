package com.kiosk.service.base;

import com.kiosk.dao.BaseRepo;
import com.kiosk.model.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public abstract class BaseService<C extends BaseEntity> {

    private final BaseRepo<C> repo;

    public BaseService(BaseRepo<C> repo) {
        this.repo = repo;
    }

    public Optional<C> findById(Integer id) {
        return repo.findById(id);
    }
}
