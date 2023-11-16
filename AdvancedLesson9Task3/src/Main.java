import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(Genre.FANTASY, "Zelda", 4),
                new Book(Genre.ROMANCE, "Notebook", 6),
                new Book(Genre.CRIME, "Train in Berlin", 16)
        );


        List<Book> OverTen = books.stream()
                .filter(book -> book.getAge() > 10)
                .collect(Collectors.toList());
        System.out.println("10 and more years old books: " + OverTen);

        List<Book> FanBook= books.stream()
                .filter(book -> book.getGenre() == Genre.FANTASY)
                .collect(Collectors.toList());
        System.out.println("Fantasy books: " + FanBook);


        List<Book> Zelda = books.stream()
                .filter(book -> book.getName().equals("Zelda"))
                .collect(Collectors.toList());
        System.out.println("Book named Zelda: " + Zelda);


        List<Article> articles = books.stream()
                .map(book -> new Article(book.getGenre(), book.getName()))
                .collect(Collectors.toList());
        System.out.println("Articles: "+ '\n' + articles  );
    }
}

record Article(Genre genre, String name) {
    @Override
    public String toString() {
        return "Article - " +
                "genre:" + genre +
                ", name:" + name + '\n' ;
    }
}
