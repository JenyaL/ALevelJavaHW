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
        String cityes = "Москва, Амстердам, Минск, Курск, Киев";
        int nextChar = 0;
        String[] newArrCity = cityes.split(", ", 0);
        System.out.println("Игра началась!!!");
        String messageOne = "Введите город, который начинается с последней буквы города - ";
        Scanner scanUser = new Scanner(System.in);
        System.out.println(messageOne + newArrCity[1]);

        Scanner enterSity = new Scanner(System.in);
        String scanSityYou = enterSity.next();
        String[] wordUser = scanSityYou.split("", 0);

        System.out.println(wordUser[wordUser.length - 1]); //последний символ введённого слова

        // Проверка правельности ввода слова


            newArrCity[1] = "null";
        // ищем слово в массиве которое начинается на первую букву введённого слова
        for (int i = 0; i < newArrCity.length; i++) {
            // сравниваем символы
            if (wordUser[wordUser.length - 1].equalsIgnoreCase(String.valueOf(newArrCity[i].charAt(0)))) {
                System.out.println("Играем дальше...");
                newArrCity[nextChar] = "null";
                break;
            }
        }
        System.out.println("Игра закончена!");
    }
}
