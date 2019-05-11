package com.kiosk.dao;

import com.kiosk.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

@NoRepositoryBean
public interface BaseRepo<D extends BaseEntity> extends PagingAndSortingRepository<D, Integer>, JpaSpecificationExecutor<D> {

    List<D> findAll();
}
