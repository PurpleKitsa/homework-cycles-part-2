public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");

        }
        System.out.println();
        for (int a = 10; a > 0; a = a - 1) {
            System.out.print(a + " ");
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int country = 12000000;
        int born = 17;
        int death = 8;
        int people = born - death;
        for (int i = 0; i <= 10; i++) {
            country += country * people / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + country);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 12_000_000) {
            total = total + (total / 100 * 7);
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total < 12_000_000) {
            total = total + (total / 100 * 7);
            total = total + salary;
            month = month + 1;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (month <= 108) {
            total = total + (total / 100 * 7);
            total = total + salary;
            month = month + 1;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int day = 1; day < 31; day++) {
            if (day % 7 == 0)
                System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчет");

        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 2022;
        int yearMax = year + 100;
        int yearMin = year - 200;
        for (int cometArrival = yearMin; cometArrival <= yearMax; cometArrival++) {
            if (cometArrival % 79 == 0) {
                System.out.println(cometArrival);
            }
        }
    }
}