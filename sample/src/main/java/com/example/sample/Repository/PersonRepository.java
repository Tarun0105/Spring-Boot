package com.example.sample.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.sample.Model.Persons;

public interface PersonRepository extends JpaRepository<Persons, Serializable>{

}
