package aop;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("We get book for SchoolLibrary");
    }

    
}
