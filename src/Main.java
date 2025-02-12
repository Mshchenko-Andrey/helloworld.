public class Main {
    public static void main(String[] args) {
        
//Домашнее задание  № 5. Условный оператор часть 2
        // Задача №1-N2

        int clientOS = 1;
        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }  if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }

        //Задача №3

        int year = 2025;
        if (year <= 1584) {
            System.out.println(year + " год не является високосным, так как високосные года введены с 1584 года.");
        } else if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задача №4

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка занимается сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потрубется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставки нет");
        }

        //Задача №5

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Некорректный номер месяца");
        }
    }
}
