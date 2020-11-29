package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnotation1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

//        Cat myCat = context.getBean("catBean", Cat.class);
//        
//        myCat.say();
        System.out.println("Person surname: " + person.getSurname());
        System.out.println("Person age: " + person.getAge());

        context.close();
    }
}
