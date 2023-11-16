import java.util.Arrays;
import java.util.List;

enum Genre {
    CRIME, FANTASY,  ROMANCE
}

class Book {
    private Genre genre;
    private String name;
    private int age;

    public Book(Genre genre, String name, int age) {
        this.genre = genre;
        this.name = name;
        this.age = age;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "genre:" + genre +
                ", name:" + name  +
                ", age:" + age ;
    }
}
