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

        String[] newArrCity = cityes.split(", ", 0);
        System.out.println("Игра началась!!!");
        Scanner scanUser = new Scanner(System.in);
        Random random = new Random();
        String word = newArrCity[random.nextInt(newArrCity.length)];
        int i = 0;
        int a = 0;

        System.out.println("перыое слово " + word + "\nнапиши город который начинается на последнюю букву текущего названия");
        String line = scanUser.nextLine();

        String[] arrLine = line.split("", 0);


        if (word.endsWith(arrLine[0])) {
            System.out.println("Отлично!!!");
            for (String num : newArrCity) {
                if (newArrCity[i].equals(word)) {
                    newArrCity[i] = "";
                    System.out.println(newArrCity[i] + "NULL");
                }
                i++;
            }
        } else {
            System.out.println("не тупи!!!");
        }
        System.out.println("Напиши город:");
        String nameCity = scanUser.next();
        for (String num : newArrCity) {
            if (nameCity.equals(newArrCity[a])) {
                newArrCity[a] = "";
                System.out.println(newArrCity[i] + "NULL");
            }
            a++;
        }


        for (String num : newArrCity) {

            System.out.println(newArrCity[a]);
            a++;
        }

    }
}
