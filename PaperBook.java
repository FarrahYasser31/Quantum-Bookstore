public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    @Override
    public double buy(int quantity, String email, String address) throws Exception {
        if (quantity > stock) {
            throw new Exception("Quantum book store: Not enough stock");
        }
        stock -= quantity;
        System.out.println("Quantum book store: Shipping paper book to " + address);
        return price * quantity;
    }
}

