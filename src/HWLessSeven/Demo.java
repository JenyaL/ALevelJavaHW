package HWLessSeven;


public class Demo {

    public static void main(String[] args) {


        Element element = new Element(1, 2);
        CheckBox checkBox = new CheckBox(1,2,3);
        RadioButtun radioButtun = new RadioButtun();

        //checkBox.select();

        Element[] arrayElem = {element, checkBox,radioButtun};

        for (int i =0; i < arrayElem.length; i++){
            arrayElem[i].select();
        }

    }
}
