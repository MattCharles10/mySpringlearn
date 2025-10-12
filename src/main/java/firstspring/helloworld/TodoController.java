package firstspring.helloworld;

import firstspring.helloworld.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Autowired
    private  TodoService todoService ;


    @PostMapping("/Create")
    ResponseEntity<Todo> Creatuser(@RequestBody Todo todo){

          Todo createTodo = todoService.createTodo(todo);
          return new  ResponseEntity<Todo>(createTodo , HttpStatus.CREATED);

    }

    //path variabile

    @GetMapping("/{id}")
    ResponseEntity<Todo> getTodoById(@PathVariable long id){
        try{
            Todo createTodo = todoService.getTodoById(id);
            return new  ResponseEntity<Todo>(createTodo , HttpStatus.CREATED);
        }catch (RuntimeException exception){
            return new  ResponseEntity<>(null , HttpStatus.NOT_FOUND);
        }

    }
    @GetMapping
    ResponseEntity<List<Todo>> getTodes (){
        return  new ResponseEntity<List<Todo>>(todoService.getTodos() , HttpStatus.OK);
    }
    // requestparam

    @PutMapping
    ResponseEntity<Todo> updatebyid(@RequestBody Todo todo){
       return new ResponseEntity<>(todoService.updateTodo(todo) , HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    void Deleteidbyid(@PathVariable long id) {
        todoService.deleteTodoById(id);
    }
}
