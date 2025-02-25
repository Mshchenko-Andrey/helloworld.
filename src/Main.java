import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//Домашнее задание  № 10. Строки
        System.out.println("Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " +  middleName;
        System.out.println("Ф.И.О сотрудника - " + fullName);


        System.out.println("Задача №2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчёта - " + fullName.toUpperCase());

        System.out.println("Задача №3");
        String fullName2 = "Иванов Семён Семёнович";
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName2);




    }
}









