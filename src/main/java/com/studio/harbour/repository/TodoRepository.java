package com.studio.harbour.repository;

import org.springframework.data.repository.CrudRepository;

import com.studio.harbour.entity.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    
}
