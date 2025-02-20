public class Main {
    public static void main(String[] args) {

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

        //Задача №2

        int start = 1;
        while (start < 11) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1 ) {

            System.out.print(i + " ");
        }
        System.out.println();

        //Задача №3

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

        //Задача №4

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


