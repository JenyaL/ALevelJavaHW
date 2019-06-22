package Task;

import java.util.ArrayList;


public class TaskFirst {

    public static void main(String[] args) {

        String enterString = "пввкев";
        int startElemetinArr = 0;
        char[] stringToArraylis = enterString.toCharArray();
        ArrayList symbArrlist = new ArrayList();
        ArrayList newArrayListUniqueChar = new ArrayList();


        // из массива char перевожу в ArrayList
        for (char q : stringToArraylis) {
            symbArrlist.add(stringToArraylis[startElemetinArr]);
            startElemetinArr++;
        }

        // поиск повторяющихся эллементов
        int startElemetin = 0;
        for (Object w : symbArrlist) {
            int finishElement = symbArrlist.size();
            for (int i = symbArrlist.size(); i > 0; i--) {
                if (symbArrlist.get(startElemetin).equals(symbArrlist.get(finishElement - 1))) {
                    //  проверяю есть ли такой эллесент в ArrayList
                        if (newArrayListUniqueChar.contains(symbArrlist.get(startElemetin))) {
                            // если элемент есть, то ничего не делаю
                        } else {
                            // если эллемента нет, то добавляю его в ArrayList
                            newArrayListUniqueChar.add(symbArrlist.get(startElemetin));
                        }
                }
                finishElement--;
            }
            startElemetin++;
        }
        // вывожу строку и колличество уникальных эллементов
        System.out.println(enterString + " - " + newArrayListUniqueChar.size());
    }
}

