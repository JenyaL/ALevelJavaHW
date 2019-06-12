package HWLessEight;

import java.util.Scanner;

public class SettingsFigure implements Info {


    private String name;
    private String color;
    int param;

    void Scan() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        param = scan.nextInt();

            try {
                if (0 <= param) {
                    int y = param % 0;
                }
            } catch (ArithmeticException e) {
                System.out.println("Число меньше либо равно нулю!");
            }

    }

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    void SettingsFigure(String colorFigure, String nameFigure) {
        this.color = colorFigure;
        this.name = nameFigure;
    }

    void figureArea() {
    }

    void perimeterFigure() {
    }

    @Override
    public void info() {
        System.out.println("Фигура - " + name + "\n"
                + "Цвет фигуры - " + color + "\n"
                + "Исходный параметр - " + param);
    }
}

