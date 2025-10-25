package firstspring.helloworld.repository;


import firstspring.helloworld.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

//CRUDE -create read update delete
public interface TodoRepository extends JpaRepository<Todo, Long> {





}
