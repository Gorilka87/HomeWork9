public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Mentor");
        System.out.println();

        System.out.println("Задача№1");
        int firstFriday = 4;
        for (int i = 1; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0)
                System.out.println("Сегодня пятница " + i +
                        "-е число. Необходимо подготовить отчет!");
        }
        System.out.println();

        System.out.println("Задача№2");
        System.out.println("Версия программы с использованием цикла do-while.");
        System.out.println();

        int distance = 42195;
        int intermediate = 500;
        do {
            System.out.println("Держитесь! Осталось " + distance + " метров.");
            distance = distance - intermediate;
        } while (distance >= 0);
        System.out.println();

        System.out.println("Версия программы с использованием цикла for.");
        System.out.println();

        for (int i = 42195; i >= 0; i -= 500) {
            System.out.println("Держитесь! Осталось " + i + " метров.");
        }
        System.out.println();

        System.out.println("Задача№3");
        System.out.println("Версия программы с использованием цикла while.");
        System.out.println();

        int money = 900;
        int day = 0;
        int budget = money;
        while(money > 0 ) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            money -=100;
        }
        System.out.println(budget + " рублей, вам хватит на " + day + " дней парковки!");
        System.out.println();

        System.out.println("Версия программы с использованием цикла for .");
        System.out.println();
        day = 0;
        money = 500;
        int budgets = money;
        for (; budgets > 0; ) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            budgets -= 100;
        }
        System.out.println(money + " рублей, вам хватит на " + day + " дней парковки!");
        System.out.println();

        System.out.println("Задача№4");
        System.out.println();

        int month = 0;
        double total = 0;
        int contribution = 15000;
        do {
            month++;
            total = total + contribution;
            if (month % 6 == 0) {
                total = total * 1.07;
            }
            System.out.printf("Месяц %d: Сумма %.2f ₽\n", month, total);
        }
        while (total < 12000000);
        System.out.println();

        System.out.println("Задача№5");
        System.out.println();
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge <= 100 && overheats <= 3 ) {
            minute ++;
            if (minute % 10 == 0) {
                overheats ++;
                minute  += 2;
                System.out.println(" Ваш аккумулятор перегрелся");
                if (overheats == 3) {
                    break;
                }
                continue;
            }
            charge = charge + 2;
        }
        System.out.println("Время зарядки составило " + minute +
                " минут(ы). Ваш аккумулятор зарядился до " + charge + "%");
        System.out.println();

        System.out.println("Finished! Thanks!");

    }
}