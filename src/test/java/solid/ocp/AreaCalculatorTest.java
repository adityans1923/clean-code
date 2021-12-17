package solid.ocp;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AreaCalculatorTest {

  AreaCalculator calculator;
  @Before public void
  Setup() {
    calculator = new AreaCalculator();
  }

  @Test public void
  Should_test_area_of_circle() {
    Circle circle = new Circle(2.0);
    double area = calculator.calculateArea(Arrays.asList(circle));
    assertEquals(12.56, area, 0.1);
  }

  @Test public void
  Should_test_area_of_square() {
    Square square = new Square(2.0);
    double area = calculator.calculateArea(Arrays.asList(square));
    assertEquals(4.0, area, 0.1);
  }

  @Test public void
  Should_test_area_of_all_provided_shapes() {
    Circle circle = new Circle(2.0);
    Square square = new Square(2.0);
    double area = calculator.calculateArea(Arrays.asList(circle, square));
    assertEquals(16.56, area, 0.1);

  }

}