package HWLessEleven;

public class RunClass {
    public static void main(String[] args) {
        new HWLessElevenPartOne.MetodOne().printMetodOne();

// Рефлексия, я сделал всё по примеру из презентации,
// ожидал что увижу скрытые методы, но видел только назание package и родительского class-а,
// а вот методов private не увидел ( HWLessEleven.HWLessElevenPartOne@74a14482)
// Необходима помощь в реализации
        HWLessElevenPartOne myTestClass = null;
        try {
            Class testClass = Class.forName(HWLessElevenPartOne.class.getName());
            myTestClass = (HWLessElevenPartOne) testClass.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        System.out.println(myTestClass);
    }
}
