package com.crud.library.domain.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface RentDao extends CrudRepository<RentDao, Integer> {
}
