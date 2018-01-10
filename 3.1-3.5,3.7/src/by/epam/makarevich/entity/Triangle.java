package by.epam.makarevich.entity;

public class Triangle extends AbstractFigure {
    private double secondSide;
    private double angle;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double angle) {
        super(firstSide);
        this.secondSide = secondSide;
        this.angle = angle;
        this.thirdSide = calculateThirdSide();
    }

    public double getSecondSide() {
        return this.secondSide;
    }

    public double getAngle() {
        return this.angle;
    }

    public double getThirdSide(){
        return this.thirdSide;
    }

    private double calculateThirdSide() {
        return Math.sqrt(this.firstSide * this.firstSide + this.secondSide * this.secondSide -
                2 * this.firstSide * this.secondSide * Math.cos(this.angle));
    }
}
