public class Main {
    public static void main(String[] args) {

//Домашнее задание  № 6. Циклы
        // Задача №1
        for (int i = 0; i < 11; i++) {
            System.out.println("Интерация цикла " + i);
        }

        //Задача №2

        for (int i = 10; i >= 0; i--) {
            System.out.println("Обратный цикл " + i);
        }

        //Задача №3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Чётные числа " + i);
        }

        //Задача №4

        for (int i = 10; i >= -10; i--) {
            System.out.println("От большего к меньшему" + i);
        }
        //Задача №5

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }

        //Задача №6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Последовательность чисел " + i);
        }

        //Задача №7

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Последовательность чисел " + i);
        }

        //Задача №8
        int savings = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + savings;
            System.out.println("Месяц " + i  + " Итого " +   total);}
        //Задача №9

        int savings2 = 29000;
        int total2 = 0;
        for (int i = 1; i < 13; i++) {
            total2 = total2 + total/12;
            total2 = total2 + savings2;
            System.out.println("Месяц " + i + " Итого " + total2);}

        //Задача №10

        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i +  " = " + (number * i));

        }
    }
}
