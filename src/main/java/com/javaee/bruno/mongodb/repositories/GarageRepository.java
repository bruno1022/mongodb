package com.javaee.bruno.mongodb.repositories;

import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javaee.bruno.mongodb.domain.Garage;

public interface GarageRepository extends MongoRepository<Garage, String>{

	Set<Garage> findByName(String name);
}
