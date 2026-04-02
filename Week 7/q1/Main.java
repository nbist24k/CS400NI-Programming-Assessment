public class Main{
    public static void main(String[] args){
        Book book1 = new Book("Harry Potter","JK Rowling",20);
        Book book2 = new Book("Alchemist","Paulo Cohelo",24);
        
        System.out.println("Book title: " + book1.title + "\nAuthor: " +
                            book1.author + "\nPrice: " + book1.priceOfBook);
    
        System.out.println("Book title: " + book2.title + "\nAuthor: " +
                            book2.author + "\nPrice: " + book2.priceOfBook);    
    }
}