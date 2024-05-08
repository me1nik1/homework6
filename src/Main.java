public class Main {
    public static void main(String[] args) {

        {
            System.out.println("Задание 1");

            for (int i = 1; i <= 10; i = i + 1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            System.out.println("Задание 2");

            for (int i = 10; i > 0; i = i - 1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            System.out.println("Задание 3");

            for (int i = 0; i <= 17; i = i + 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            System.out.println("Задание 4");

            for (int i = 10; i >= -10; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            System.out.println("Задание 5");

            for (int year = 1904; year <= 2096; year = year + 4) {
                System.out.println(year + " ");
            }
            System.out.println();
        }

        {
            System.out.println("Задание 6");

            for (int i = 7; i <= 98; i = i + 7) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            System.out.println("Задание 7");

            for (int i = 1; i <= 512; i = i * 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        {
            System.out.println("Задание 8");

            int deposit = 29_000;
            int sum = 0;
            for (int i = 1; i <= 12; i++) {
                sum += deposit;
                System.out.println("Месяц " + i + ", сумма накоплений равна  " + sum + " рублей ");
            }
            System.out.println();
        }

        {
            System.out.println("Задание 9");

            int deposit = 29_000;
            int sum = 0;
            for (int i = 1; i <= 12; i++) {
                sum = sum + (int) (sum * 0.01) + deposit;
                System.out.println("Месяц " + i + ", сумма накоплений равна  " + sum + " рублей ");
            }
            System.out.println();
        }

        {
            System.out.println("Задание 10");
            for (int i = 1; i <= 10; i++) {
                System.out.println("2 * " + i + " = " + (2 * i));
            }
            System.out.println();

        }
    }
}