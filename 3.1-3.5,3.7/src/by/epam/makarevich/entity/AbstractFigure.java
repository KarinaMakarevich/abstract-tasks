package by.epam.makarevich.entity;

public abstract class AbstractFigure {
    public double firstSide;

    public AbstractFigure(double firstSide){
        this.firstSide = firstSide;
    }

    public double getFirstSide(){
        return this.firstSide;
    }
}
