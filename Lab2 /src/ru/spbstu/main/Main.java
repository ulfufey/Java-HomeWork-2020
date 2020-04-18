package ru.spbstu.main;

import ru.spbstu.main.shapes.Shape;
import ru.spbstu.main.shapes.Rectangle;
import ru.spbstu.main.shapes.Triangle;
import ru.spbstu.main.shapes.Circle;
import ru.spbstu.main.shapes.StructurePoint;

public class Main {
    public static double findMaxArea(Shape[] shapes) {
        double maxArea = 0;
        for (int i = 0; i < shapes.length - 1; i++) {
            maxArea = Math.max(shapes[i].getArea(), shapes[i + 1].getArea());
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Rectangle(10,5, new StructurePoint(10,10));
        shapes[1] = new Rectangle(10,10, new StructurePoint(15,15));
        shapes[2] = new Triangle(10,10,11, new StructurePoint(100,100));
        shapes[3] = new Circle(10, new StructurePoint(150,150));
        shapes[4] = new Rectangle(100,100,new StructurePoint(900,900));
        System.out.println(findMaxArea(shapes));
    }
}
