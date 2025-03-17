public class Main {

    //Домашнее Задание №13. Методы объектов
    public static void main(String[] args) {
        // Создаем авторов
        Author author1 = new Author("Джоан", "Роулинг");
        Author author2 = new Author("Джон", "Толкин");

        // Создаем книги
        Book book1 = new Book("Гарри Поттер", author1, 1996);
        Book book2 = new Book("Хоббит", author2, 1937);

        // Выводим информацию о книгах
        System.out.println("Книга 1: " + book1.getTitle() + ", Автор: " +
                book1.getAuthor().getFirstName() + " " +
                book1.getAuthor().getLastName() + ", Год: " +
                book1.getYear());

        System.out.println("Книга 2: " + book2.getTitle() + ", Автор: " +
                book2.getAuthor().getFirstName() + " " +
                book2.getAuthor().getLastName() + ", Год: " +
                book2.getYear());

        // Изменяем год публикации первой книги
        book1.setYear(1873);
        System.out.println("Обновленный год публикации книги 1: " + book1.getYear());

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        System.out.println("book1 equals book2: " + book1.equals(book2));

        System.out.println("HashCode book1: " + book1.hashCode());
        System.out.println("HashCode book2: " + book2.hashCode());


    }
}


















