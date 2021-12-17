package solid.ocp;

import java.util.List;

public class AreaCalculator {
  public double calculateArea(List<Shape> shapes) {
    double area = 0;
    for (Shape shape : shapes) {
      if (shape.getType() == ShapeType.SQUARE) {
        area += calculateSquareArea((Square) shape);
      } else if (shape.getType() == ShapeType.CIRCLE) {
        area += calculateCircleArea((Circle) shape);
      }
    }
    return area;
  }

  private double calculateSquareArea(Square square) {
    return square.getSide() * square.getSide();
  }

  private double calculateCircleArea(Circle circle) {
    return Math.PI * circle.getRadius() * circle.getRadius();
  }
}
