import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    //Домашнее Задание №12. Объекты и классы
    public static void main(String[] args) {

        Author author1 = new Author("Джоан", "Роулинг");
        Author author2 = new Author("Джон", "Толкин");


        Book book1 = new Book("Гарри Поттер", author1, 1996);
        Book book2 = new Book("Хоббит", author2, 1937);


        System.out.println("Книга 1: " + book1.getTitle() + ", Автор: " +
                book1.getAuthor().getFirstName() + " " +
                book1.getAuthor().getLastName() + ", Год: " +
                book1.getYear());

        System.out.println("Книга 2: " + book2.getTitle() + ", Автор: " +
                book2.getAuthor().getFirstName() + " " +
                book2.getAuthor().getLastName() + ", Год: " +
                book2.getYear());


        book1.setYear(1997);
        System.out.println("Обновленный год публикации книги 1: " + book1.getYear());
    }
}


















