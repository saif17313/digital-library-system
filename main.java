

import digital-library-system.Ebook;
import digital-library-system.EbookProxy;

public class Main {
    public static void main(String[] args) {
        Ebook ebook1= new EbookProxy("Information_System_Design.pdf");
        Ebook ebook2= new EbookProxy("Design_Patterns_in_Java.pdf");
        ebook1.display();
        ebook1.display();
        ebook2.display();
        ebook2.display();
    }
}
