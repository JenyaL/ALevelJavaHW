import java.util.Scanner;

public class HWLessFour {


    public static void main(String[] args) {

        // Пройдитесь по циклу от 1 до 100 и выведите все четные числа.
        /*int q = 0;
        while (q <= 100) {
            if (q % 2 == 0) {
                System.out.println(q);
            }
            q++;
        }*/
        // Различие >> и >>>
        /* >> Бинарный оператор сдвига вправо.
        Значение правых операндов перемещается вправо на количество бит,
        заданных левых операндом.*/

        /* >>> Нулевой оператор сдвига вправо.
         Значение левых операндов перемещается вправо на количество бит,
         заданных правым операндом, а сдвинутые значения заполняются нулями.*/

        // 4. Напишите программу,
        /*которая берет любую строку и меняет ее,
        сортируя слова в обратном порядке. Например, “я хочу есть” → “есть хочу я”*/

       /* Scanner scanIn = new Scanner(System.in);
        String strScanIn = scanIn.nextLine();
        String[] strIn = strScanIn.split(" ", 0);
        for (int i = strIn.length; i > 0; i--) {
            System.out.print(strIn[i - 1] + " ");
        }*/

        // Additional Task -  число Фибоначи
        int numberFibo = 4181;
        int numberFirst = 1;
        int nuberNext = 1;
        int nuberEnd = 0;
        int sizeChar = 0;
        while (numberFibo > nuberEnd) {
            nuberEnd = numberFirst + nuberNext;
            numberFirst = nuberNext;
            nuberNext = nuberEnd;
            sizeChar++;
            System.out.println(nuberEnd + ", ");
            if (nuberEnd == numberFibo) {
                System.out.print("операция номер " + sizeChar + " на которой было достигнуто " + numberFibo);
            }
        }
    }
}
