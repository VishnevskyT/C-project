import java.util.Scanner;

public class Exercise_4 {

//    Задача 4
//    Создайте программу, которая выводит в консоль число даты. Например, на вход 02/11/1995 = 0 +
//            2 + 1 + 1 + 1 + 9 + 9 + 5 = 28 на выход = 28
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть дату у форматі DD-MM-YYYY: ");
        char[] inputDate = scanner.nextLine().toCharArray();
        System.out.print("Число дати ");
        System.out.print(inputDate);
        System.out.print(" = ");
        int sum = 0;

        for (int i = 0; i < inputDate.length; i++) {
            if (inputDate[i] > 47 && inputDate[i] < 58) {
                sum += inputDate[i] - '0';
                if (i == inputDate.length - 1) {
                    System.out.print(inputDate[i] + " = ");
                }
                else {
                    System.out.print(inputDate[i] + " + ");
                }
            } inputDate[i] = 0;
        }
        System.out.println(sum);
    }
}
