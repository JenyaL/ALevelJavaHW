public class LessensAreClassroom {
    public static void main(String[] args) {

        String str = "QWERTY YTREWQ";

        str.length(); // длина
        System.out.println(str.length() + " длина");

        str.charAt(1); // символ под номером
        System.out.println(str.charAt(0) + " символ под номером");

        str.concat("String char"); // склейка
        System.out.println(str.concat("- + NEW" + " склейка"));

        str.substring(1); // игнорирует до нужного символа
        System.out.println(str.substring(5) + " игнорирует до нужного символа");

        str.equalsIgnoreCase("R"); // сравнивает данную строку с другой строкой, игнорируя регистр (false or true)
        System.out.println(str.equalsIgnoreCase("QWERTY_YTREWQ") + " игнорирует значение");

        str.endsWith("R"); // проверяет на что заканчивается (false or true)
        System.out.println(str.endsWith("Q") + " проверяет на что заканчивается");

        str.split(" ", 1); // ищет слова в строке для передачи в МАССИВ !!!

        str.replace("c", ""); // понять!!!

    }
}
