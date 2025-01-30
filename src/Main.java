public class Main {
    public static void main(String[] args) {

//Домашнее задание  № 3. Переменные
        // Задача №1
        byte schoolBag = 125;
        System.out.println(schoolBag);
        short basket = 30000;
        System.out.println(basket);
        int box = 483500;
        System.out.println(box);
        long pantry = 950_000_000L;
        System.out.println(pantry);
        double kitchen = 10.5;
        System.out.println(kitchen);
        float appartmens = (float) 38.5;
        System.out.println(appartmens);

        //Задача N2
        byte a = 67;
        System.out.println(a);
        short b = -159;
        System.out.println(b);
        short c = 569;
        System.out.println(c);
        int d = 27897;
        System.out.println(d);
        long e = 987_678_965_549L;
        System.out.println(e);
        float f = 2.786f;
        System.out.println(f);
        double g = 27.12;
        System.out.println(g);

        //Задача №3
        byte studentsLP = 23;
        System.out.println("Учеников у Людмилы Павловны" + studentsLP);
        byte studentsAS = 27;
        System.out.println("Учеников у Анны Сергеевны" + studentsAS);
        byte studentsEA = 30;
        System.out.println("Учеников у Екатерины Андреевны" + studentsEA);
        short paper = 480;
        System.out.println(paper + "Листов бумаги закупили для учеников");
        int allStudents = studentsAS + studentsEA + studentsLP;
        System.out.println("Общее количество учеников из трёх классов" + allStudents);
        int numberOfSheets = paper / allStudents;
        System.out.println("На каждого ученика рассчитано" + numberOfSheets + "листов бумаги");

        //Задача №4
        byte bottle = 16;
        System.out.println("Бутылок производится за 2 минуты" + bottle);
        short bottle2 = (short) (bottle / 2);
        System.out.println("Бутылок производится за 1 минуту" + bottle2);
        short bottle3 = (short) (bottle2 * 20);
        System.out.println("За 20 минут машина произвела" + bottle3 + " штук бутылок");
        short minute1day = 24 * 60;
        System.out.println("В одном дне" + minute1day + "минут");
        short bottle1Day = (short) (bottle2 * minute1day);
        System.out.println("За 1 день машина произвела" + bottle1Day + "штук бутылок");
        short minute3day = (24 * 3) * 60;
        System.out.println("В 3-ёх днях" + minute3day + "минут");
        short bottle3Day = (short) (bottle2 * minute3day);
        System.out.println("За 3 дня машина произвела" + bottle3Day + "штук бутылок");
        int minute1Month = 1440 * 30;
        System.out.println("В одном месяце" + minute1Month + "минут");
        int bottle1Month = minute1Month * bottle2;
        System.out.println("За 1 месяц машина произвела" + bottle1Month + "штук бутылок");

        //Задача №5
        byte whitePaint = 2;
        System.out.println("Количество банок белой краски для 1 класса" + whitePaint);
        byte drownPaint = 4;
        System.out.println("Количество банок коричневой краски для 1 класса" + drownPaint);
        byte allPaint = 120;
        System.out.println("На ремонт школы закуплено" + allPaint + " банок краски");
        short classPaint = (short) (whitePaint + drownPaint);
        System.out.println("Количество банок для покраски 1 класса" + classPaint);
        short allClasses = (short) (allPaint / classPaint);
        System.out.println("В школе всего " + allClasses + "классов");
        short allWhitePaint = (short) (whitePaint * allClasses);
        System.out.println("Необходимо" + allWhitePaint + "банок белой краски для ремонта школы");
        short allDrownPaint = (short) (drownPaint * allClasses);
        System.out.println("Необходимо" + allDrownPaint + "банок коричневной краски для ремонта школы");
        System.out.println("В школе, где" + allClasses + "классов, нужно" + allWhitePaint + "банок белой краски и" + allDrownPaint + "банок кричневой краски");

        //Задача 6
        short banana = 5;
        System.out.println(banana);
        short milk = 200;
        System.out.println(milk);
        short iceCream = 100;
        System.out.println(iceCream);
        short egg = 70;
        System.out.println(egg);
        short veightBanana = 5 * 80;
        System.out.println("Вес пяти бананов составляет" + veightBanana + " гр ");
        short veightMilk = 105 * 2;
        System.out.println("Вес 200мл молока составляет" + veightMilk + " гр ");
        short veightIceCream = 100 * 2;
        System.out.println("Вес мороженого составляет" + veightIceCream + " гр ");
        short veightEgg = 70 * 4;
        System.out.println("Вес четырёх яиц составляет" + veightEgg + " гр ");
        short veightBreakfast = (short) (veightBanana + veightMilk + veightIceCream + veightEgg);
        System.out.println("Общий вес завтрака составлет" + veightBreakfast + " гр ");
        float breakfast = veightBreakfast / 1000F;
        System.out.println("Вес завтрака составляет" + breakfast + " кг ");

        //Задача №7
        short weight = 7;
        System.out.println("Спортсмену необходимо сбросить" + weight + " кг ");
        short weightLossDiet = 250;
        System.out.println("Рацион для потери" + weightLossDiet + " грамм веса в день ");
        short weightLossDiet2 = 500;
        System.out.println("Рацион для потери" + weightLossDiet2 + " грамм веса в день ");
        short weightGr = 7 * 1000;
        System.out.println("Спортмену необходимо сбросить" + weightGr + " грамм!");
        short dayDiet1 = (short) (weightGr / weightLossDiet);
        System.out.println("Уйдет" + dayDiet1 + "дней на похудение если спортсмен будет терять по 250 грамм веса в день");
        short daydiet2 = (short) (weightGr / weightLossDiet2);
        System.out.println(" У спортсмена уйдёт" + daydiet2 + "дней на похудение если спортсмен будет терять по 500 грамм веса в день");
        double averageWeight = (double) (weightLossDiet + weightLossDiet2) / 2;
        System.out.println("Средняя потеря веса в день при соблюдении диеты составляет" + averageWeight + " гр ");
        double avarageLoss = (float) weightGr / averageWeight;
        System.out.println("В среднем для похудения потребуется" + avarageLoss + " дней ");

        //Задача №8
        int wageMaria = 67_760;
        System.out.println("Зарплата Марии" + wageMaria + "рублей в месяц");
        int wageDenis = 83_690;
        System.out.println("Зарплата Дениса" + wageDenis + " рублей в месяц");
        int wageKristina = 76_230;
        System.out.println("Зарплата Кристины" + wageKristina + " рублей в месяц");
        int indexingMaria = (int) (wageMaria * 0.1f);
        System.out.println("Надбака к зарплате Марии с учетом индексации составляет" + indexingMaria + "рублей в месяц");
        int allWageMaria = wageMaria + indexingMaria;
        System.out.println("Общая сумма зарплаты Марии после индексации составляет" + allWageMaria + "рублей в месяц");
        int indexngDenis = (int) (wageDenis * 0.1f);
        System.out.println("Надбавка к зарплате Дениса с учетом индексации составляет" + indexngDenis + " рублей в месяц");
        int allWageDenis = wageDenis + indexngDenis;
        System.out.println("Общая сумма зарплаты Дениса с учетом индексации составляет" + allWageDenis + " рублей в месяц");
        int indexingKristina = (int) (wageKristina * 0.1f);
        System.out.println("Надбавка к зарплате Кристины с учетом индексации составялет" + indexingKristina + " рублей в месяц ");
        int allWageKristina = (int) (wageKristina * 0.1f);
        System.out.println("Общая сумма зарплаты Кристины с учетом индексации составляет" + allWageKristina + " рублей в месяц ");

        int ageIncomeMaria = wageMaria * 12;
        System.out.println("Годовой заработок Марии без учета индексации составляет" + ageIncomeMaria + "рублей в год");
        int ageIncomeDenis = wageDenis * 12;
        System.out.println("Годовой заработок Дениса без учета индексации составляет" + ageIncomeDenis + " рублей в год");
        int ageIncomeKristina = wageKristina * 12;
        System.out.println("Годовой заработок Кристины без учета индексации составляет" + ageIncomeKristina + " рублей в год");

        int ageAllIncomeMaria = allWageMaria * 12;
        System.out.println("Годовой заработой Марии с учетом индексации составляет" + ageAllIncomeMaria + " рублей в год ");
        int ageAllIncomeDenis = allWageDenis * 12;
        System.out.println("Годовой заработок Дениса с учетом индексации составляет" + ageAllIncomeDenis + " рублей в год ");
        int ageAllIncomeKristina = allWageKristina * 12;
        System.out.println("Годовой заработок Кристины с учетом индексации составляет" + ageAllIncomeKristina + "рублей в год ");

        int differencenEarningsMaria = ageAllIncomeMaria - ageIncomeMaria;
        System.out.println("Годовой доход Марии вырос на " + differencenEarningsMaria + " рублей ");
        int differencenEarningsDenis = ageAllIncomeDenis - ageIncomeDenis;
        System.out.println("Годовой доход Дениса вырос на " + differencenEarningsDenis + " рублей ");
        int differencenEarningsKristina = ageAllIncomeKristina - ageIncomeKristina;
        System.out.println("Годовой доход Кристины вырос на " + differencenEarningsKristina + " рублей ");
        System.out.println("Маша теперь получает" + allWageMaria + " рублей в месяц. Годовой доход вырос на" + differencenEarningsMaria + "рублей");
        System.out.println("Денис теперь получет" + allWageDenis + " рублей в месяц. Годовой доход вырос на" + differencenEarningsDenis + "рублей");
        System.out.println("Кристина теперь получает" + allWageKristina + " рублей в месяц. Годовой доход вырос на" + differencenEarningsDenis + "рублей");


    }
}