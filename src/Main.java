public class Main {
    public static void main(String[] args) {

//Домашнее задание  № 2. Переменные
        // Задача №1 - №3
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //Задача №4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача №5

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //Задача №6 - №7

        var boxerWeight = 78.2;
        var boxerWeight2 = 82.7;
        var totalWeight = boxerWeight + boxerWeight2;
        System.out.println("Общий вес двух боксёров" + totalWeight + " кг ");
        var DifferenceInWeight = (boxerWeight2 - boxerWeight);
        System.out.println("Разница веса двух бойцов" + DifferenceInWeight + " кг ");
        var weightDivisionRemainder = boxerWeight2 / boxerWeight;
        System.out.println("Остаток от деления между двумя весами" + weightDivisionRemainder + " кг ");

        //Задача №8
        var timeJob = 640;
        var timeJobWorker = 8;
        var numberOfEmployees = timeJob / timeJobWorker;
        System.out.println("Количество работников в компании" + numberOfEmployees + " кг ");
        var newWorker = 94;
        var totalNubmerOfEmployees = numberOfEmployees + newWorker;
        System.out.println("Работников в компании с учётом новичков" + totalNubmerOfEmployees );
        var totalTimeJob = timeJobWorker * totalNubmerOfEmployees;
        System.out.println("Если в компании рабаотает 174 человека, то всего" + totalTimeJob + " часа работы может быть поделено между сотрудниками ");

    }
}