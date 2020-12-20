package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary{
    
    @Override
    public void getBook() {
        System.out.println("We get book for UniLibrary");
    }

    
     public void getMagazine() {
        System.out.println("We get magazine for UniLibrary");
    }
     
     public void returnBook() {
         System.out.println("We return book for UniLibrary");
     }
}
