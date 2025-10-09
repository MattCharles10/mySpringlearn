package firstspring.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldcompiler {

   @GetMapping ("/h1")
   String sayhello( ){
       return "Hello world";
   }

}
