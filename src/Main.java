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


        //Задача №2
        int temperature = 6;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        }


        //Задача №3
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость меньше " + speed + " можно ездить спокойно");
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

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число " + two);
        } else {
            System.out.println("Наибольшее число " + three);
        }
    }
}

