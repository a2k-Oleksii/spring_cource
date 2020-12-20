package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect 
public class LoggingAspect {
    
    @Before("execution(public void aop.UniLibrary.getBook())")
    public void beforeGetBookAdviceUniLibrary() {
        System.out.println("beforeGetBookAdviceUniLibrary: attempt get book in the aop.UniLibrary.");
    }
    
    @Before("execution(public void getBook(aop.Book))")
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: attempt get book");
    }
    
    @Before("execution(public void get*(..))")
    public void beforeGetAdviceAll() {
        System.out.println("beforeGetAdviceAll: attempt all get methods");
    }
    
    @Before("execution(public void returnBook())")
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: attempt return book");
    }
    
    @Before("execution(public * returnBook())")
    public void beforeReturnBookAdviceAllAccsess() {
        System.out.println("beforeReturnBookAdviceAllAccsess: attempt return book All return type methods");
    }
}
