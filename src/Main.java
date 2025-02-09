public class Main {
    public static void main(String[] args) {

//Домашнее задание  № 4. Условный оператор
        // Задача №1

        int age = 8;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " То он совершеннолетний");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }
//Домашнее задание  № 5. Условный оператор часть 2
        // Задача №1-N2
        int clientOS = 0;
        int clientDeviceYear = 2014; //


        //Задача №2
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        }

        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Операционная система не распознана");
        }

        //Задача №3
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость меньше " + speed + " можно ездить спокойно");
        }
        int year = 2025;
        if (year <= 1584) {
            System.out.println(year + " год не является високосным, так как високосные года введены с 1584 года.");
        } else if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задача №4
        int agePeople = 25;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в детский сад");
        }
        if (agePeople >= 7 && agePeople <= 17) {
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в школу");
        }
        if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить в университет");
        }
        if (agePeople > 24) {
            System.out.println("Если возраст человека равен " + agePeople + " то ему нужно ходить на работу");
        }

        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Доставка занимается сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потрубется 2 дня");
        } else if (deliveryDistance >60 && deliveryDistance <=100) {
            System.out.println("Потребуется 3 дня");
        }else {
            System.out.println("Доставки нет");
        }

        //Задача №5
        int ageChild = 15;
        if (ageChild < 5) {
            System.out.println("Если возраст ребёнка равен " + ageChild + " то ему нельзя кататься на аттракционах");
        }
        if (ageChild > 5 && ageChild < 14) {
            System.out.println("Если возраст ребёнка равен " + ageChild + " можно кататься на аттрационе в сопровождении взросложного");
        }
        if (ageChild > 14) {
            System.out.println("Если возраст ребёнка старше " + ageChild + " можно кататься на аттрационе без сопровождения взрослого");
        }
        // Задача №6
        int full = 102;
        int seating = 60;
        int count = 50;
        if (count > 102) {
            System.out.println("Свободных мест нет");

        }
        if (count < full && count > seating) {
            System.out.println("Свободно " + (full - count) + " стоячих мест, сидячих мест нет");
        } else {
            System.out.println("Свободно " + (seating - count) + " сидячих мест");
        }


        //Задача №7

        int one = 10;
        int two = 3;
        int three = 15;
        int monthNumber = 12;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число " + two);
        } else {
            System.out.println("Наибольшее число " + three);
        }


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
                System.out.println("Некорректный номер месяца");}
        }
       }
