import java.util.Scanner;

public class HWLessThree {
    public static void main(String[] args) {
        /*4. Создайте массив из имен городов, например: «Москва», «Амстердам», «Минск», «Курск», «Киев».
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
        String[] arrayCity = citys.split(", ", 0);
        System.out.println("Давай поиграем в ‘Города’. Ты первый называй!");
        int end = 0;
        for (int q = 0; q <= arrayCity.length; q++) {
            Scanner scanEnteredConsole = new Scanner(System.in);
            String consoleIn = scanEnteredConsole.next();
            for (int i = 0; i <= arrayCity.length; i++) {
                char charWordFromConsoleIn = consoleIn.charAt(consoleIn.length() - 1);
                String strWordFromConsoleIn = String.valueOf(charWordFromConsoleIn);
                String strWordFromArrayCity = arrayCity[i];
                strWordFromArrayCity.charAt(0);
                if (strWordFromConsoleIn.equalsIgnoreCase(String.valueOf(strWordFromArrayCity.charAt(0)))) {
                    System.out.println(strWordFromArrayCity);
                    System.out.println("тебе на - " + strWordFromArrayCity.charAt(strWordFromArrayCity.length() - 1));
                    arrayCity[i] = "null";
                    break;
                } else if (i == arrayCity.length - 1) {
                    end = arrayCity.length - 1;
                    break;
                }
            }
            if (end == arrayCity.length - 1) {
                System.out.println("Я проиграл, ты знаешь больше городов");
                break;
            }
        }
    }
}
