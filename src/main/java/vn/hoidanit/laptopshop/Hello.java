package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Hello {

    @GetMapping("/")
    public String index() {
        return "Hello World from Spring hehe";
    }
}
