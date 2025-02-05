public class Main {
    public static void main(String[] args) {

//Домашнее задание  № 4. Условный оператор
        // Задача №1

        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " То он совершеннолетний");
        }
        int age2 = 16;
        if (age2 < 18) {
            System.out.println("Если возрасть человека равен " + age2 + " он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача №2
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
        int temperature2 = 7;
        if (temperature2 > 5) {
            System.out.println("На улице " + temperature2 + " градусов, можно идти без шапки");
        }

        //Задача №3
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость меньше " + speed + " можно ездить спокойно");
        }

        //Задача №4
        int age4 = 6;
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + " то ему нужно ходить в детский сад");
        }
        if (age4 >= 7 && age4 <= 17) {
            System.out.println("Если возраст человека равен " + age4 + " то ему нужно ходить в школу");
        }
        if (age4 >= 18 && age4 <= 24) {
            System.out.println("Если возраст человека равен " + age4 + " то ему нужно ходить в университет");
        }
        if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + "то ему нужно ходить на работу");
        }

        //Задача №5
        int ageChild = 15;
        if (ageChild < 5) {
            System.out.println("Если возраст ребёнка равен " + ageChild + " то ему нельзя кататься на аттракционах");
        }
        if (ageChild > 5 && ageChild < 14) {
            System.out.println("Если возраст ребёнка равен " + ageChild + " можно кататься на аттрационе в совпровождении взросложного");
        }
        if (ageChild > 14) {
            System.out.println("Если возраст ребёнка старше " + ageChild + " можно кататься на аттрационе без сопровождения взрослого");
        }
        // Задача №6
        int passengerSeat = 103;
        if (passengerSeat <= 102) {
            System.out.println("В вагоне есть сидячие или стоячие места ");
        } else
            System.out.println("Вагон полностью забит");

        //Задача №7

        int one = 10;
        int two = 3;
        int three = 15;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число " + two);
        } else {
            System.out.println("Наибольшее число " + three);

        }
    }


}

















