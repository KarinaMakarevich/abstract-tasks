package by.epam.makarevich.entity;

public class Rectangle extends AbstractFigure {
    private double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        super(firstSide);
        this.secondSide = secondSide;
    }

    public double getSecondSide() {
        return this.secondSide;
    }
}
