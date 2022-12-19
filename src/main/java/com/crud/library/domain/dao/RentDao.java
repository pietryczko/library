package com.crud.library.domain.dao;

import com.crud.library.domain.Rent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface RentDao extends CrudRepository<Rent, Integer> {
}
