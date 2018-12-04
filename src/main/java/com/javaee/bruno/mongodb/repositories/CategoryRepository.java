package com.javaee.bruno.mongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javaee.bruno.mongodb.domain.Category;

public interface CategoryRepository extends MongoRepository<Category, String>{

}
