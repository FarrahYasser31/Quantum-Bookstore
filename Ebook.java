public class Ebook extends Book {
    private String filetype;
    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public Ebook(String isbn, String title, int year, double price, String author, String filetype) {
        super(isbn, title, year, price, author);
        this.filetype = filetype;
    }

    @Override
    public double buy(int quantity, String email, String address) {
        System.out.println("Quantum book store: Sending ebook to " + email);
        return price * quantity;
    }
}