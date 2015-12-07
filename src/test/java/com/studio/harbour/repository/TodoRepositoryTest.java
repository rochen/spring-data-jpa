package com.studio.harbour.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.studio.harbour.entity.Todo;

public class TodoRepositoryTest {
	@Autowired
	private TodoRepository repository;
	
	@Test 
	public void testTodoCreate() {
		Todo entity = new Todo();
		entity.setTitle("robin");
		entity.setDescription("description");
		repository.save(entity);
    }
}
