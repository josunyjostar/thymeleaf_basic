package thymeleafinit.park.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @GetMapping("if-unless")
    public String users(Model model) {
        List<User> users = new ArrayList<>();
        users.add(new User("jeyoung","jypark@newploy.net","ADMIN"));
        users.add(new User("hwasin","hwasin@naver.com","GUEST"));
        users.add(new User("heyjung","lemonkim@daum.net","MANAGER"));
        model.addAttribute("users",users);
        return "if-unless";
    }

    @GetMapping("switch-case")
    public String switchExample(Model model) {
        User user = new User("lemonkim","lemonkim@newploy.net",    "MANAGER");
        model.addAttribute("user",user);
        return "switch-case";
    }

    @GetMapping("hello-mvc")
    public  String helloMvc(@RequestParam("name") String name,Model model) {
        model.addAttribute("name",name);
        return "hello-mvc";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("test") String str) {
        return  "api way " + str;
    }
}
