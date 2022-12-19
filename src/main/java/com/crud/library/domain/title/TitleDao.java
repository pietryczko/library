package com.crud.library.domain.title;

import com.crud.library.domain.title.Title;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface TitleDao extends CrudRepository<Title, Integer> {
}
