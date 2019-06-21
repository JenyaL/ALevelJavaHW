package Task;

/*
Написать программу, которая считает длину
(количество символов) самой длинной подстроки без повторяющихся символов.
"Например аббабвбввбббваа Будет 3"
ИЛИ ааааа - 1
ИЛИ пввкев - 3

*/

import java.util.Arrays;

public class TaskFirst {

    public static void main(String[] args) {

        String str = "112211";
        int start = 0;
        int next = 1;


        char[] ff = str.toCharArray();
        Arrays.sort(ff);
        System.out.println(ff);


    }
}

