package com.kiosk.dao;

import com.kiosk.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepo<D extends BaseEntity> extends PagingAndSortingRepository<D, Long>, JpaSpecificationExecutor<D> {
}
