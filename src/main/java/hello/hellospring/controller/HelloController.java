package hello.hellospring.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("spring")
    public String spring(Model model) {
        model.addAttribute("data", "spring!!");
        return "spring";
    }
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data","Hello!!");
        return "hello";
    }
}
