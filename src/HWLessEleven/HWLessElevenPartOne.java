package HWLessEleven;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public class HWLessElevenPartOne {
    // Я читал что можно создавать параметризированные аннотации,
    // но я не понимаю как приминять такие анатации
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AnatNew {
    }

    @AnatNew()
    static class MetodOne {
        String c = "Out Anat";

        void printMetodOne() {
            System.out.println(c);
        }
    }

    private class MetodTwo{
        void printMetodTwo(){
            System.out.println("printMetodTwo");
        }
    }
    private class MetodThree {
        void printMetodThree(){
            System.out.println("printMetodThree");
        }
    }
}