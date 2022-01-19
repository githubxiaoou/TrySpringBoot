package boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.bean.Book;
//@ResponseBody
//@Controller

@RestController
public class HelloController {

    @Autowired
    public Book mBook;

    @RequestMapping("/hello2")
    public String handle01() {
        return "Hello, Spring Boot 2!";
    }

    @RequestMapping("/book")
    public Book book() {
        return mBook;
    }
}
