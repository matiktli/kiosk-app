package com.kiosk.service.base;

import com.kiosk.dao.BaseRepo;
import com.kiosk.exception.ObjectNotFoundException;
import com.kiosk.handler.ErrorUtils;
import com.kiosk.model.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public abstract class BaseService<C extends BaseEntity> {

    protected final BaseRepo<C> repo;

    public BaseService(BaseRepo<C> repo) {
        this.repo = repo;
    }

    public Optional<C> findById(Integer id) {
        return repo.findById(id);
    }

    public C save(C entity) {
        return repo.save(entity);
    }

    public void delete(Integer id) {
        C found = findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(ErrorUtils.MSG_INSTANT_OBJECT_NOT_FOUND,  ErrorUtils.ErrorCodes.DATABASE_ISSUE));
        repo.delete(found);
    }

    public Page<C> findAll(Pageable pageable) {
        return repo.findAll(pageable);
    }

    public C update(C entity) {
        return this.save(entity);
    }
}
