package by.epam.makarevich.action;

import by.epam.makarevich.entity.AbstractFigure;

public interface IFigureAction<T extends AbstractFigure> {
   abstract double calculateSquare(T figure);
   abstract double calculatePerimeter(T figure);
}
