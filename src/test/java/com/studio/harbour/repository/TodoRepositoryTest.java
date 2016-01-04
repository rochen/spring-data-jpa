package com.studio.harbour.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.studio.harbour.configuration.PersistenceContext;
import com.studio.harbour.entity.Todo;

@RunWith(SpringJUnit4ClassRunner. class)
@ContextConfiguration(classes = {PersistenceContext.class})
public class TodoRepositoryTest {	
	@Autowired
	private TodoRepository repository;
	
	@Test 
	public void testTodoCreate() {
		Todo entity = new Todo();
		entity.setTitle("robin");
		entity.setDescription("description");
		Todo ent = repository.save(entity);
		assertEquals("robin", ent.getTitle());
    }
}
