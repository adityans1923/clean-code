package examples.edge;

import org.junit.Test;

import static examples.edge.Triangle.triangleType;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test public void
  test_equilateral_triangle() {
    assertEquals("Equilateral Triangle", triangleType(4, 4, 4));
  }

  @Test public void
  test_isosceles_triangle() {
    assertEquals("Isosceles Triangle", triangleType(6, 7, 6));
  }

  @Test public void
  test_scalene_triangle() {
    assertEquals("Scalene Triangle", triangleType(6, 7, 8));
  }

}