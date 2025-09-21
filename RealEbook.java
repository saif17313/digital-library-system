package digital-library-system;

public class RealEbook implements Ebook {
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
