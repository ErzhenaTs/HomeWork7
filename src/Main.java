//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int needOverallSum = 2459000;
        int sum = 0;
        int monthSum = 15000;
        double percent = 10 / 100;
        int month = 0;
        while (sum < needOverallSum) {
            sum += monthSum;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна" + sum + " рублей");

        }

        System.out.println("Задача 2");
        int number = 0;
        while (number<10) {
            number++;
            System.out.println(number);
        }
        System.out.println();
        for (; number >=1; number--) {
            System.out.println(number);
        }

        System.out.println("Задача 3");
        int population = 12000000;
        int birthPerThousand = 17;
        int deathPerThousand = 8;
        int currentYear = 2024;
        for (int year = currentYear; year < currentYear + 10; year++) {
            population += population * birthPerThousand / 1000 - population * deathPerThousand / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }


        System.out.println("Задача 4");
        int needOverallSum4 = 12000000;
        int percent4 = 70 / 100;
        int month4 = 0;
        int sum4 = 0;
        int monthSum4 = 15000;
            while (sum4 < needOverallSum4) {
                sum4 = sum4 * (1 + percent4) + monthSum4;
                month4++;
            System.out.println("Месяц " + month4 + ", сумма накоплений равна " + sum4 + " рублей");}


        System.out.println("Задача 5");
        int needOverallSum5 = 12000000;
        int percent5 = 70 / 100;
        int month5 = 0;
        int sum5 = 0;
        int monthSum5 = 15000;
        while (sum5 < needOverallSum5) {
            sum5 = sum5 * (1 + percent5) + monthSum5;
            month5++;
            if (month5 % 6 == 0)
            System.out.println("Месяц " + month5 + ", сумма накоплений равна " + sum5 + " рублей");}


        System.out.println("Задача 6");
        int percent6 = 70 / 100;
        int month6 = 0;
        int sum6 = 0;
        int monthSum6 = 15000;
        for (int year6 = 1; year6 <=9; year6 ++){
            for (int anotherMonth6 = 1; anotherMonth6 <=6; anotherMonth6++) {
                sum6 = sum6 * (1 + percent6) + monthSum6;
                month6++;
        }
            System.out.println("Месяц " + month6 + ", сумма накоплений равна " + sum6 + " рублей");}


        System.out.println("Задача 7");
        int firstFriday = 2;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница " + day + " число. Необходимо сдать отчет");
        }


        System.out.println("Задача 8");
        int period = 79;
        int startSeeing = 0;
        int currentYear8 = 2025;
        int startYear = currentYear8 - 200;
        int endYear = currentYear8 + 100;
        for (int year = startYear; year < endYear; year++) {
            if (year % period == startSeeing) {
                System.out.println(year);
            }
        }



    }
}