package HWLessEight;


import java.util.InputMismatchException;

public class GeometricFigure {

    public static void main(String[] args) {

        SettingsFigure circle = new SettingsFigure() {
            @Override
            void figureArea() {
                for (int i = 0; i <= 1; i++)
                if (0 < getParam()) {
                    double s = Math.PI * (getParam() * getParam());
                    float fl = (float) s;
                    System.out.println("Площадь круга - " + fl);
                } else if (getParam() <= 0) {
                    i = 0;
                    System.out.println("Допускается ввод цифр больше 0!");
                    Scan();
                }
            }

            @Override
            void perimeterFigure() {
                double p = (2 * Math.PI) * getParam();
                float pFl = (float) p;
                System.out.println("Периметр круга - " + pFl);
            }
        };
        circle.Scan();
        /*circle.SettingsFigure("белый", "Круг");
        circle.info();*/
        circle.figureArea();
        //circle.perimeterFigure();

        /*System.out.println("\n");

        SettingsFigure square = new SettingsFigure() {
            @Override
            void figureArea() {
                float s = getParam() * getParam();
                System.out.println("Площадь квадрата - " + s);
            }

            @Override
            void perimeterFigure() {
                float pFl = getParam() * 4;
                System.out.println("Периметр квадрата - " + pFl);
            }
        };
        square.SettingsFigure("красный", "Квадрат");
        square.info();
        square.figureArea();
        square.perimeterFigure();*/

    }

}
