package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        
        Person person = context.getBean("personBean", Person.class);   
        person.callYourPet();
        Person person2 = context.getBean("personBean", Person.class);   
        System.out.println(person == person2);
        
//        
//        Pet cat = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        cat.say();
//        cat2.say();
//
//        System.out.println(cat == cat2);
        
        context.close();
        
    }
    
}
