package CRLessEight;

import java.util.Arrays;

public class CRLessEight {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Seasons.values()));

        for (Seasons ses : Seasons.values()) {   //ЗАПОМНИТЬ!!!!
            System.out.println(ses);
        }
        int sesonNumber = Seasons.SPRING.ordinal();
        System.out.println(sesonNumber);

        Seasons seasons = Seasons.valueOf("WINTER");
        System.out.println(seasons);

    }

    enum Seasons {
        WINTER("зима"),
        SUMER("лето"),
        SPRING("весна"),
        FALL("осень");

        private String seson;

        Seasons(String seson) {
            this.seson = seson;
        }

        @Override
        public String toString() {
            return seson;
            }
        }
    }



