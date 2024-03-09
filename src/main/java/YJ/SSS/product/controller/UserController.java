package YJ.SSS.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/bye")
    public String bye(){
        return "bye bye bye";
    }
    @GetMapping("/asd")
    public String asd(){
        return "asdasd";
    }
}
