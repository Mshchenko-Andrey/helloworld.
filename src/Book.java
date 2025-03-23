public class Book {
    private String title;
    private Author author;
    private int year;


    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Книга: " + title + ", Автор: " + author.toString() + ", Год: " + year;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Проверка на ссылочное равенство
        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj; // Приведение типа
        return year == book.year && // Сравнение полей
                title.equals(book.title) &&
                author.equals(book.author);
    }
    @Override
    public int hashCode() {
        return 31 * title.hashCode() + author.hashCode() + year;
    }

}


