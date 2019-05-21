public class HWLesTwo {
    public static void main(String[] args) {

        //ДЗ строки (выполняем всё)
    /*Выведите в консоль одну строку с числами из массива (которую мы
    создавали в 1-ом задании), разделенными “;”*/

        int[] arrayTaskOne = new int[6];
        int i = 0;
        for (int num : arrayTaskOne) {
            arrayTaskOne[i] = i;
            System.out.print(arrayTaskOne[i] + "; ");
            i++;
        }

    /*Создайте переменную со строкой “Мама мыла раму”. Создайте
    массив из всех слов, которые встречаются в этой строке. (Посмотрите
    на методы строки и подумайте, какой метод можно использовать) */
        System.out.println("\nTask - 2");

        String taskTwo = "Мама мыла раму";
        String[] arrayTaskTwo = taskTwo.split(" ", 3);
        for (int q = 0; q < arrayTaskTwo.length; q++) {
            System.out.print(arrayTaskTwo[q] + " ");
        }

    /*Создайте строку “Я хочу переносы строк.” Замените все символы
    пробела в строке, на символы переноса строк и выведите в консоль.*/
        System.out.println("\nTask - 3");

        String taskThree = "Я хочу переносы строк.";
        System.out.println(taskThree.replace(" ", "-"));

    /*ДЗ массивы (выполняем всё):
    Создайте массив из целых чисел и поместите сразу 10 значений.
    Пройдитесь по ним и поменяйте значения.*/
        System.out.println("\nTask - 4");
        int[] arrayTaskFour = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int w = 0;
        int e = 10;
        for (int num : arrayTaskFour) {
            arrayTaskFour[w] = e;
            w++;
            e--;
        }


    /*Создайте массив из дробных чисел (5 элементов).
    Создайте 3 переменных таких типов: byte, int, long.
    Создайте массив типа int. Попытайтесь туда положить переменные.
    Создайте любой двумерный массив, заполните любыми данными и
    выведите в консоль*/
        System.out.println("\nTask - 5");
        double[] arrayTaskFiveA = {1.1, 1.2, 1.3, 1.4, 1.5};

        byte a = 8;
        int b = 10;
        long c = -11;
        int[] arrayTaskFiveB = new int[3];
        arrayTaskFiveB[0] = a;
        arrayTaskFiveB[1] = b;
        arrayTaskFiveB[2] = (int) c;

        int[][] arrayTaskFiveC = new int[2][3];
        arrayTaskFiveC[0][0] = arrayTaskFiveB[0];
        arrayTaskFiveC[0][1] = arrayTaskFiveB[1];
        arrayTaskFiveC[0][2] = arrayTaskFiveB[2];
        arrayTaskFiveC[1][0] = (int) arrayTaskFiveA[0];
        arrayTaskFiveC[1][1] = (int) arrayTaskFiveA[2];
        arrayTaskFiveC[1][2] = (int) arrayTaskFiveA[3];

        for (int z = 0; z < 3; z++) {
            System.out.println(arrayTaskFiveC[0][z] + " & " + arrayTaskFiveC[1][z]);
        }



    /*ДЗ строки + массивы(выполняем всё):

    1. Создайте строку "Hello world!"
    - Выведите первый символ
    - Выведите последний символ
    - Создайте массив символов, положите туда все символы слова world
    - Вывести массив в консоль
    - Вывести в консоль предпоследний элемент массива не используя
    прямой доступ по индексу (arr[3] – не сгодится)*/
        System.out.println("\nTask - 6");
        String taskSix = "Hello world!";

        System.out.println(taskSix.charAt(0));
        System.out.println(taskSix.charAt(taskSix.length() - 1));

        String[] arrayTaskSix = new String[5];
        for (int d = 0; d < 5; d++) {
            arrayTaskSix[d] = String.valueOf(taskSix.charAt(d));
            System.out.print(arrayTaskSix[d]);
        }

        System.out.println("\n" + arrayTaskSix[arrayTaskSix.length - 2]);



/*2. Используя инкремент и декремент измените любые два значения.
    Затем примените «преинкремент» например: ++a; В чём разница между ++a и
    a++?*/
        System.out.println("\nTask - 7");
        int taskSevenA = 1;
        int taskSevenB = 2;
        int taskSevenC = ++taskSevenA;
        int taskSevenD = --taskSevenB;
        System.out.println(taskSevenC + " " + taskSevenD);
    }
}
