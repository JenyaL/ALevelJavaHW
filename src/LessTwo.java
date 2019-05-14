public class LessTwo {


    public static void main(String[] args) {
        char cOne = 'n';
        char letter0 = '\u804F';
        char letterA = '\141';

        int a = 2;
        int b = 2;
        int c = 4;


        /*for (int i = 0; i < 3; i++){
            System.out.println(i);
        }*/

        String[][] mass = new String[][] {{"Roma" , "Dashs" , "Andry"}, {"men", "woman" , "men"}};

        for (int i = 0; i <= mass.length; i++) {
            System.out.println(mass[0][i] + " "+ mass[1][i]);

            char add = '1';


        }
        String str = "ROMA_AMOR";

        str.length(); // длина
        str.charAt(1); // символ под номером
        str.concat("1231231"); // склейка
        System.out.println(str.substring(1)) ;

        str.equalsIgnoreCase("R"); // игнорирует значение
        str.endsWith("R"); // проверяет на что заканчивается
        System.out.println(str.endsWith("R"));



    }
}
