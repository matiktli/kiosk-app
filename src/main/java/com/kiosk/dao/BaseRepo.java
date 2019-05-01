package com.kiosk.dao;

import com.kiosk.model.BasicEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepo<D extends BasicEntity> extends PagingAndSortingRepository<D, Long>, JpaSpecificationExecutor<D> {
}
