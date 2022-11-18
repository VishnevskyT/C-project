import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_3 {

//    Задача 3
//    Создайте программу, которая выводит в консоль число имени, например, на вход Roman = R(18) +
//    О(15) + M(13) + A(1) + N(14) = 61 на выход 61.
public static void main(String[] args) {
    char[] alphabetLowerCase = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    String alphabet = new String(alphabetLowerCase);
    char [] alphabetUpperCase = alphabet.toUpperCase().toCharArray();
    System.out.print("Введіть якесь крутецьке ім'я латиницею, щоб перевірити його числову вагу: _");
    Scanner scanner = new Scanner(System.in);
    char[] input = scanner.next().toCharArray();
    int sumUpperCase = 0;
    int sumLowerCase = 0;

    for (int i = 0; i < input.length; i++) {
        for (int j = 0; j < alphabetUpperCase.length; j++) {
            if (input[i] == alphabetUpperCase[j]) {
                System.out.println("\"" + input[i] + "\" = " + (j + 1) + ",");
                sumUpperCase += (j + 1);
            }
        }
    }

    for (int i = 0; i < input.length; i++) {
        for (int j = 0; j < alphabetLowerCase.length; j++) {
            if (input[i] == alphabetLowerCase[j]) {
                System.out.println("\"" + input[i] + "\" = " + (j + 1) + ",");
                sumLowerCase += (j + 1);
            }
        }
    }

    if (sumLowerCase != 0 || sumUpperCase != 0) {
        System.out.print("тобто, числова вага введеного імені становить: ");
        System.out.print(sumLowerCase + sumUpperCase);
    }
    else System.out.println("Таке ім'я точно існує? Спробуйте ще раз, використовуючи літери латинської абетки.");



}


}
