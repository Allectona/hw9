public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    /* 1 задание */
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] totalSalary = generateRandomArray();
        int total = 0;
        for (int a = 0; a < totalSalary.length; a++) {
            total = total + totalSalary[a];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    /* 2 задание */

    public static void task2() {
        int spending[] = generateRandomArray();
        int maxSpending = -1;
        int minSpending = spending[0];
        for (int b = 0; b < spending.length; b++) {
            if (spending[b] > maxSpending) {
                maxSpending = spending[b];
            }
        }
        for (int min : spending) {
            if (min < minSpending) {
                minSpending = min;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpending + " рублей. Максимальная сумма трат за день составила " + maxSpending + " рублей.");
    }

    /* 3 задание */

    public static void task3() {
        int[] spendingPerMonth = generateRandomArray();
        double spendingPerDayAverage = 0;
        int amountOfDays = 30;
        double spendingPerMonthTotal = 0;

        for (int d = 0; d < spendingPerMonth.length; d++) {
            spendingPerMonthTotal = spendingPerMonthTotal + spendingPerMonth[d];
            spendingPerDayAverage = spendingPerMonthTotal / amountOfDays;
        }
        System.out.println("Средняя сумма трат за месяц составила " + spendingPerDayAverage + " рублей.");
    }

    /* 4 задание */

    public static void task4(){
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int n=reverseFullName.length; n>0; n--) {
                System.out.print(reverseFullName[n-1]);
        }
    }
}
