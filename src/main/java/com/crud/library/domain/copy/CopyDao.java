package com.crud.library.domain.copy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface CopyDao extends CrudRepository<Copy, Integer> {
}
