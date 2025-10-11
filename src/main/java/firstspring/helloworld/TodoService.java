package firstspring.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private  TodoRepository todoRepository;



    public void getTodo(){
        System.out.println(todoRepository.getallTodos());
    }
}
