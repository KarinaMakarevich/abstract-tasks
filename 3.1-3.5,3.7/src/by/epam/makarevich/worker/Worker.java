package by.epam.makarevich.worker;

import by.epam.makarevich.action.IFigureAction;
import by.epam.makarevich.action.TriangleAction;
import by.epam.makarevich.entity.Triangle;
import by.epam.makarevich.action.RectangleAction;
import by.epam.makarevich.entity.AbstractFigure;
import by.epam.makarevich.entity.Rectangle;

public class Worker {
    public static void main(String[] args) {
        AbstractFigure rectangle = new Rectangle(2, 5);
        AbstractFigure triangle = new Triangle(1, 6, Math.PI / 6);
        IFigureAction rectangleAction = new RectangleAction();
        IFigureAction triangleAction = new TriangleAction();
        System.out.println("Rectangle perimeter: " + rectangleAction.calculatePerimeter(rectangle));
        System.out.println("Rectangle square: " + rectangleAction.calculateSquare(rectangle));
        System.out.println("Triangle perimeter: " + triangleAction.calculatePerimeter(triangle));
        System.out.println("Triangle square: " + triangleAction.calculateSquare(triangle));
    }
}
