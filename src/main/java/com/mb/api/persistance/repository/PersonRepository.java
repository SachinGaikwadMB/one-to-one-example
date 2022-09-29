package com.mb.api.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mb.api.persistance.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>
{

}
