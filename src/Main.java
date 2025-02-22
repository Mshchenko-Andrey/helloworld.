import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//Домашнее задание  № 6. Циклы
        //Задача №1
        System.out.println("Задача №1");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        for (int i = 0; i < box.length; i++) {
            System.out.println(box[i]);
        }
        double[] number = {1.57, 7.654, 9.986};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
//Домашнее задание  № 7. Циклы часть №2
        // Задача №1

        int savings = 15000;
        int total = 0;
        int moth = 0;
        while (total < 2_459_000) {
            total = total + total / 12;
            total = total + savings;
            moth++;
            System.out.println("Месяц " + moth + " сумма накоплений равна " + total + " рублей ");
        }

        int[] arbitrary = new int[5];
        arbitrary[0] = 10;
        arbitrary[1] = 20;
        arbitrary[2] = 30;
        arbitrary[3] = 40;
        arbitrary[4] = 50;
        for (int i = 0; i < arbitrary.length; i++) {
            System.out.println(arbitrary[i]);
        }
        //Задача №2
        System.out.println("Задача №2");

        for (int index = 0; index < box.length; index++) {
            if (index == box.length - 1) {
                System.out.println(box[index]);
                break;
            }
            System.out.print(box[index] + ", ");
        int start = 1;
        while (start < 11) {
            System.out.print(start + " ");
            start = start + 1;
        }
        for (int index = 0; index < number.length; index++) {
            if (index == number.length - 1) {
                System.out.println(number[index]);
                break;
            }
            System.out.print(number[index] + ", ");
        }
        for (int index = 0; index < arbitrary.length; index++) {
            if (index == arbitrary.length - 1) {
                System.out.println(arbitrary[index]);
                break;
            }
            System.out.print(arbitrary[index] + ", ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1 ) {

            System.out.print(i + " ");
        }
        System.out.println();

        //Задача №3
        System.out.println("Задача №3");
        for (int i = box.length - 1; i >= 0; i--) {
            System.out.print(box[i] + (i > 0 ? ", " : ""));
        }
        System.out.println();
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + (i > 0 ? ", " : ""));

        int initialPopulation = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int years = 10;
        int currentPopulation = initialPopulation;
        int year = 1;
        while (year <= years) {
            int births = currentPopulation * birthRate / 1000;
            int deaths = currentPopulation * deathRate / 1000;
            currentPopulation += (births - deaths);
            System.out.println("Год " + year + " численность населения составляет " + currentPopulation);
            year++;
        }
        System.out.println();
        for (int i = arbitrary.length - 1; i >= 0; i--) {
            System.out.print(arbitrary[i] + (i > 0 ? ", " : ""));
        }
        System.out.println();

        //Задача №4
        System.out.println("Задача №4");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }

        int initialAmount = 15_000;
        double targetAmount = 12_000_000;
        double monthlyInterestRate = 0.07;
        int month = 0;

        while (initialAmount < targetAmount) {
            month++;
            initialAmount *= (1 + monthlyInterestRate);
            System.out.println("Месяц " + month + " сумма накоплений равна " + initialAmount + " рублей");
        }

        System.out.println("Для накопления " + targetAmount + " рублей потребуется " + month + " месяцев.");

        //Задача №5
        int initialAmount2 = 15_000;
        double targetAmount2 = 12_000_000;
        double monthlyInterestRate2 = 0.07;
        int month2 = 0;

        while (initialAmount2 < targetAmount2) {
            month2++;
            initialAmount2 *= (1 + monthlyInterestRate2);
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + " сумма накоплений равна " + initialAmount2 + " рублей");
            }
        }
        System.out.print(Arrays.toString(arr) + " ");
    }
}

        //Задача №6
        int initialAmount3 = 15_000;
        double monthlyInterestRate3 = 0.07;
        int years3 = 9;
        int months3 = years3 * 12;

        for (
                int month3 = 1;
                month3 <= months3; month3++) {
            initialAmount3 *= (1 + monthlyInterestRate3);
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + " сумма накоплений равна " + initialAmount3 + " рублей");
            }
        }


        //Задача №7
        int firstFriday = 3;
        int daysInMonth = 31;
        for (
                int day = 1;
                day <= daysInMonth; day++) {
            if ((day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчет.");
            }
        }



        //Задача №8
        int currentYear = 2023;
        int cometFlyPeriod = 79;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int firstCometYear = 0;
        while (firstCometYear + cometFlyPeriod <= startYear) {
            firstCometYear += cometFlyPeriod;
        }


        for (
                int year4 = firstCometYear;
                year4 <= endYear; year4 += cometFlyPeriod) {
            if (year4 >= startYear) {
                System.out.println(year4);
            }
        }
    }
}


