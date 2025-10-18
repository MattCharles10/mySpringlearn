package firstspring.helloworld;


import firstspring.helloworld.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

//CRUDE -create read update delete
public interface TodoRepository extends JpaRepository<Todo, Long> {





}
