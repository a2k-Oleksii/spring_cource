package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        
        UniLibrary uni = context.getBean("uniLibraryBean", UniLibrary.class);
        Book book = context.getBean("bookBean", Book.class);
        uni.getBook(book);
//        System.out.println(uni.returnBook());
//        uni.getMagazine();
        
//        SchoolLibrary school = context.getBean("schoolLibraryBean", SchoolLibrary.class);
//        school.getBook(); 
        
        context.close();
                
    }
}
