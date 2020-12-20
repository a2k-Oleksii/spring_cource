package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect 
public class LoggingAspect {
    
    @Before("execution(public void aop.UniLibrary.getBook())")
    public void beforeGetBookAdviceUniLibrary() {
        System.out.println("beforeGetBookAdvice: attempt get book in the aop.UniLibrary.");
    }
    
    @Before("execution(public void getBook())")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: attempt get book");
    }
    
     
    @Before("execution(public void get*())")
    public void beforeGetAdviceAll() {
        System.out.println("beforeGetBookAdvice: attempt all get methods");
    }
}
