package co.develhope.DIdemoex.controller;

import co.develhope.DIdemoex.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService myService;

    public MyController(MyService myService){
        this.myService = myService;
        System.out.println("MyController() constructor has been called");
    }

    @GetMapping("/getName")
    public String getName(){
        System.out.println("MyController.getName() method has been called");
        return myService.getName();
    }

    @GetMapping("/")
    public String welcome(){
        return "Welcome";
    }
}
