package voronov;

import voronov.classes.Circle;
import voronov.classes.Circles;
import voronov.classes.Cylinder;
import voronov.classes.Cylinders;

import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        Circle circle;
        Circles circles;
        int counter = 1;
        int count;
        String temp;
        double number;
            System.out.println("Введте количество окружностей");
            while (Circle.isCorrectCount(temp = read.next()) < 0);
            count = Integer.parseInt(temp);
        circles = new Circles(count);;
            do {
                System.out.println("Введите радиус окружности №" + counter);
                while (Circle.isCorrect(temp = read.next()) < 0);
                number = Double.parseDouble(temp);
                circle = new Circle(number, counter);
                circles.addNewCircle(counter - 1, circle);
                counter++;
            }
            while (counter != count + 1 );

            counter = 1;
            Cylinder cylinder;
            Cylinders cylinders;
            System.out.println("Введите количество цилиндров");
            while (Circle.isCorrectCount(temp = read.next()) < 0);
            count = Integer.parseInt(temp);
            cylinders = new Cylinders(count);
            double r, h;
            do {
                System.out.println("Введите радиус цилиндра №" + counter);
                while (Circle.isCorrect(temp = read.next()) < 0);
                r = Double.parseDouble(temp);
                System.out.println("Ведите высоту цилиндра №" + counter);
                while (Circle.isCorrect(temp = read.next()) < 0);
                h = Double.parseDouble(temp);
                cylinder = new Cylinder(r, h, counter);
                cylinders.addNewCylinder(counter - 1, cylinder);
                counter++;
            }
            while (counter != count + 1);

            read.close();
            circles.getInfo();
            circles.getMaximumArea();
            System.out.println();
            cylinders.getInfo();
            cylinders.getAverageVolume();

        }
    }