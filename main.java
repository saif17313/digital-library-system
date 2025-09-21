

interface Ebook {
    void display();
}

 class RealEbook implements Ebook {
    private String filename;

    public RealEbook(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading ebook: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying ebook: " + filename);
    }
}

 class EbookProxy implements Ebook {
    private RealEbook realEbook;
    private String filename;

    public EbookProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realEbook == null) {
            realEbook = new RealEbook(filename);
        }
        realEbook.display();
    }
}




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
