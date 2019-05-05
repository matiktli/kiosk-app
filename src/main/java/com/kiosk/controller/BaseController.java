package com.kiosk.controller;

import com.kiosk.dto.BaseDTO;
import com.kiosk.model.BaseEntity;
import com.kiosk.service.base.BaseService;
import com.kiosk.transformer.BaseTransformer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;
import java.util.Optional;

public abstract class BaseController<C extends BaseDTO, D extends BaseEntity> implements KioskAppService<C> {

    protected final BaseTransformer<D, C> transformer;
    protected final BaseService<D> service;

    public BaseController(BaseTransformer<D, C> transformer, BaseService<D> service) {
        this.transformer = transformer;
        this.service = service;
    }

    @Override
    public ResponseEntity<C> getById(Integer id) {
        Optional<D> found = service.findById(id);
        if (!found.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(transformer.toDto(found.get()));
    }

    @Override
    public ResponseEntity<Page<C>> findAll(Pageable page) {
        Page<D> entities = service.findAll(page);
        return ResponseEntity.ok(entities.map(transformer::toDto));
    }

    @Override
    public ResponseEntity<C> create(@Valid C dto) {
        D entityToSave = transformer.toEntity(dto);
        entityToSave = service.save(entityToSave);
        return ResponseEntity.ok(transformer.toDto(entityToSave));
    }

    @Override
    public ResponseEntity<C> update(Integer id, @Valid C dto) {
        D entityToUpdate = transformer.toEntity(dto);
        entityToUpdate = service.update(entityToUpdate);
        return ResponseEntity.ok(transformer.toDto(entityToUpdate));
    }

    @Override
    public ResponseEntity<Void> delete(Integer id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
