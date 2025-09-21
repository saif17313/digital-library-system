package digital-library-system;


package digital-library-system;
public class EbookProxy implements Ebook {
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