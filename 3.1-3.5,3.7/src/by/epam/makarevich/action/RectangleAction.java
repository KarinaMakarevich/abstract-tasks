package by.epam.makarevich.action;

import by.epam.makarevich.entity.Rectangle;

public class RectangleAction implements IFigureAction<Rectangle> {
    @Override
    public double calculateSquare(Rectangle rectangle) {
        return rectangle.getFirstSide() * rectangle.getSecondSide();
    }

    @Override
    public double calculatePerimeter(Rectangle rectangle) {
        return 2 * rectangle.getFirstSide() * rectangle.getSecondSide();
    }
}
