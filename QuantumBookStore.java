import java.util.*;

public class QuantumBookStore {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public List<String> removeOutdatedBooks(int currentYear, int maxAge) {
        List<String> removed = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> iterator = books.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Book> entry = iterator.next();
            if (entry.getValue().isOutdated(currentYear, maxAge)) {
                removed.add(entry.getKey());
                iterator.remove();
            }
        }
        return removed;
    }

    public double buyBook(String isbn, int quantity, String email, String address) throws Exception {
        if (!books.containsKey(isbn)) {
            throw new Exception("Quantum book store: Book not found");
        }
        return books.get(isbn).buy(quantity, email, address);
    }
}
