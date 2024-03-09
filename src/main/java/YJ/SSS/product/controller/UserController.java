package YJ.SSS.product.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/bye")
    public String bye(){
        return "bye bye bye";
    }
}
