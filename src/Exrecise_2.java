import java.util.Scanner;

public class Exrecise_2 {
//    Задача 2
//    Напишите метод, который принимает число, которое не содержит нулей и возвращает цифры в
//    обратном порядке.
//    Например, на вход: 789 на выход: 987

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть будь-яке ціле число: _");
        int input = scanner.nextInt();
        int res;
        if (input == 0)
            System.out.println("З веденим числом 0, нажаль, нічого цікавого не зробиш. Введіть щось щось більше або менше, але ціле :)");
        for (int i = 1; i <= Math.abs(input); i*=10) {
            res = (Math.abs(input)/i) % 10;
            if (res != 0)
                System.out.print(res);
            }
//        if (input < 0) {
//            System.out.println("-");
//        }
   }

}
