import java.util.Scanner;

public class Main {

    //        Задача 1
//        Напишите метод, который принимает число и возвращает сумму цифр данного числа

    static void recur(int input) {
        int res;
        res = input % 10;
        if (input >= 10)
            recur(input / 10);

        System.out.print(res + ", ");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть будь-яке ціле число: _");
        int input = scanner.nextInt();
        int sum = 0;
        if (input == 0) {
            System.out.println("З веденим числом 0, нажаль, нічого не порахувати. Введіть щось щось більше або менше, але ціле :)");
        } else {
            for (int i = Math.abs(input); i > 0; i /= 10) {
                sum = sum + (i % 10);
            }
            System.out.print("Введене число складається з наступних цифр ");
            recur(Math.abs(input));
            System.out.print("cума цифр яких становить: " + sum);
        }
    }
}