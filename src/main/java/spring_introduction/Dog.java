package spring_introduction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("dogBean")
//@Scope("prototype")
public class Dog implements Pet {
//    private String name;

    public Dog() {
        System.out.println("Dog bean is created!");
    }
    
    @PostConstruct
    public void init(){
        System.out.println("Class Dog init method.");
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog destroy method.");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    
    @Override
    public void say() {
        System.out.println("Gav-Gav!");
    }
}
