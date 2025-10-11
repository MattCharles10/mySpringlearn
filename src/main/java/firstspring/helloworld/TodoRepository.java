package firstspring.helloworld;

import org.springframework.stereotype.Component;

@Component
public class TodoRepository {

    String getallTodos(){

        return "Todos";
    }



}
