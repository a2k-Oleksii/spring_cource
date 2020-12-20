package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{
    
    public void getBook(Book book) {
        System.out.println("We get book for UniLibrary " + book.getName());
    }
    
     public void getMagazine() {
        System.out.println("We get magazine for UniLibrary");
    }
     
     public String returnBook() {
         System.out.println("We return book for UniLibrary");
         return "OK";
     }
}
