public class Author {
    private String firstName; // Имя автора
    private String lastName;  // Фамилия автора


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Author author = (Author) obj;
        return firstName.equals(author.firstName) && lastName.equals(author.lastName);
    }
    @Override
    public int hashCode() {
        return 31 * firstName.hashCode() + lastName.hashCode();
    }
}


