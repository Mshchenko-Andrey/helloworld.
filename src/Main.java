import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//Домашнее задание  № 9. Массивы часть №2
        System.out.println("Задача №1");
        int[] amountSpent = new int[5];
        amountSpent[0] = 100_000;
        amountSpent[1] = 150_000;
        amountSpent[2] = 200_000;
        amountSpent[3] = 300_000;
        amountSpent[4] = 400_000;
        int sum = 0;
        for (int i = 0; i < amountSpent.length; i++) {
            sum = sum + amountSpent[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " Рублей");


        System.out.println("Задача №2");

        int[] expenses = {250_000, 130_000, 170_000, 800_000, 1_100_000};

        int minExpense = expenses[0];
        int maxExpense = expenses[0];

        for (int i = 1; i < expenses.length; i++) {
            if (expenses[i] < minExpense) {
                minExpense = expenses[i];
            }
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }

        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей.");

        System.out.println("Задача №3");

        int[] expenses2 = {300_442, 730_865, 130_342, 600_523, 500_721}; // Пример данных

        // Считаем сумму всех трат
        int totalExpenses2 = 0;
        for (int expense2 : expenses2) {
            totalExpenses2 += expense2;
        }

        // Вычисляем среднее значение трат за месяц
        double averageExpenses = (double) totalExpenses2 / expenses.length;

        // Выводим результат в консоль
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", averageExpenses);

        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        int left = 0;
        int right = reverseFullName.length - 1;

        while (left < right) {

            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;

            left++;
            right--;
        }
        System.out.println(reverseFullName);


    }
}








