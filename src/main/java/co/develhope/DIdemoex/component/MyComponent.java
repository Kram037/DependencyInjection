package co.develhope.DIdemoex.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentname;

    public MyComponent(){
        this.myComponentname = "Marco De Fenzo";
        System.out.println("MyComponent() constructor has been called");
    }

    public String getMyComponentName(){
        System.out.println("MyComponent.getMyComponentName has been called");
        return myComponentname;
    }

}
