package HWLessEight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SettingsFigure implements Info {


    private String name;
    private String color;
    int param;

    void Scan() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число: ");
            param = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Допускается ввод цифр больше 0!"); Scan();}
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

