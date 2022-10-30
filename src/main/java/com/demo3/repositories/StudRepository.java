package com.demo3.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo3.entities.Stud;

public interface StudRepository extends CrudRepository<Stud, Long> {

}
