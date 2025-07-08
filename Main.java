public class Main {
    public static void main(String[] args) {
        QuantumBookStore store = new QuantumBookStore();

        store.addBook(new PaperBook("111", "Java Basics", 2010, 100.0, "Alice", 5));
        store.addBook(new Ebook("222", "Python Guide", 2022, 50.0, "Bob", "pdf"));
        store.addBook(new ShowCaseBook("333", "History of Code", 2005, 0.0, "Carol"));

        System.out.println("Quantum book store: Removing outdated books...");
        for (String removed : store.removeOutdatedBooks(2025, 10)) {
            System.out.println("Quantum book store: Removed ISBN " + removed);
        }

        try {
            double amount = store.buyBook("111", 2, "a@a.com", "123 Main St");
            System.out.println("Quantum book store: Paid amount = " + amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            double amount = store.buyBook("222", 1, "b@b.com", "");
            System.out.println("Quantum book store: Paid amount = " + amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            store.buyBook("333", 1, "c@c.com", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}