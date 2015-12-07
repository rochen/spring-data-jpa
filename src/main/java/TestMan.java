import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.studio.harbour.configuration.PersistenceContext;
import com.studio.harbour.entity.Todo;
import com.studio.harbour.repository.TodoRepository;

public class TestMan {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PersistenceContext.class);
		TodoRepository repo = ctx.getBean(TodoRepository.class);
		
		Todo entity = new Todo();
		entity.setTitle("title");
		entity.setDescription("description");
		repo.save(entity);
		
		Iterable<Todo> todos = repo.findAll();
		for(Todo todo: todos) {
			System.out.println(todo);
		}
		
		ctx.close();
	}

}
