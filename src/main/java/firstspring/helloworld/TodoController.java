package firstspring.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Autowired
    private  TodoService todoService ;

    @GetMapping("/get")
    String getTodo(){

        todoService.getTodo();
        return "todo";

    }

    @PostMapping("/Create")
    String Creatuser(@RequestBody String body){

        return body;

    }

    //path variabile

    @GetMapping("/{id}")
    String getid(@PathVariable long id){

        return "todo id" + id;

    }
    // requestparam
    @GetMapping
    String getidparam(@RequestParam(name = "getid") long id){

        return "todo with id" + id;

    }
    @PutMapping("/update/{id}")
    String updateidbyid(@PathVariable long id){
       return "Update with id" + id;
    }
    @DeleteMapping("/Delete/{id}")
    String Deleteidbyid(@PathVariable long id){
        return "Delete with id" + id;
    }

}
