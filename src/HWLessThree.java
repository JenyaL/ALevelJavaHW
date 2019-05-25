import java.util.Random;
import java.util.Scanner;

public class HWLessThree {
    public static void main(String[] args) {
        /*Scanner scanObj = new Scanner(System.in);
        System.out.println("Enter symbvol");
        int a = scanObj.nextInt();
        System.out.println("enter next symbvol");
        int b = scanObj.nextInt();
        int result = a + b;
        System.out.println(result);*/

        /*
        Scanner scanObj = new Scanner(System.in);
        String b = scanObj.next();
        switch (b) {

            case "a":
                System.out.println("nocorrect");
                break;
            case "c":
                System.out.println("corect");
                break;
        }*/
        /*4. Создайте массив из имен городов, например:
«Москва», «Амстердам», «Минск», «Курск», «Киев».
        Напишите игру в города в компьютером ☺
        Процесс такой:
        Как только игра начинается в консоль выводится надпись:
«Давай поиграем в ‘Города’. Ты первый называй!»
        Пользователь печатает в консоль, имя города, компьютер смотрит на
        последнюю букву, и ищет в массиве значения которые начинаются с
        указанной буквы. Компьютеру нельзя использовать один и тот же город
        несколько раз. Если компьютер не знает города на букву, либо исчерпал
        весь свой запас вывести в консоль: «Я проиграл, ты знаешь больше
        городов».*/
        String citys = "Москва, Амстердам, Минск, Курск, Киев";

        // преоброзовать строку в массив
        String[] arrayCity = citys.split(", ", 0);

        // создание массив адля хранения использованных слов
        int sizeArrayUseWord = 1;
        String[] arrayUseWord = new String[sizeArrayUseWord];

        // начало Игры
        System.out.println("Давай поиграем в ‘Города’. Ты первый называй!");


        for (int i = 0; i < arrayCity.length; i++) {
            // ввод в консоль слова
            Scanner scanEnteredConsole = new Scanner(System.in);
            String consoleIn = scanEnteredConsole.next();

            // полцчаем последнюю букву слова из консоли
            char charWordFromConsoleIn = consoleIn.charAt(consoleIn.length() - 1);
            String strWordFromConsoleIn = String.valueOf(charWordFromConsoleIn);

            // добавление слова в архивный массив
            arrayUseWord[i] = strWordFromConsoleIn;

            // ищем первую букву всех слов в масииве
            String strWordFromArrayCity = arrayCity[i];
            strWordFromArrayCity.charAt(0);

            // ищем слово которое начинается на последнюю букву слова из консоли
            if (strWordFromConsoleIn.equalsIgnoreCase(String.valueOf(strWordFromArrayCity.charAt(0)))) {

                System.out.println(strWordFromConsoleIn + " " + strWordFromArrayCity.charAt(0));


            }


        }
    }
}
