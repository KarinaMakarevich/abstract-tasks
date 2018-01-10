package by.epam.makarevich.action;

import by.epam.makarevich.entity.Triangle;

public class TriangleAction implements IFigureAction<Triangle> {
    @Override
    public double calculateSquare(Triangle triangle) {
        return 0.5 * triangle.getFirstSide() * triangle.getSecondSide() * Math.sin(triangle.getAngle());
    }

    @Override
    public double calculatePerimeter(Triangle triangle) {
        return triangle.getFirstSide() + triangle.getSecondSide() + triangle.getThirdSide();
    }
}
