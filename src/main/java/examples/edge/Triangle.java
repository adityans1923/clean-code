package examples.edge;

public class Triangle {

  public static String triangleType(int side1, int side2, int side3) {
    if(side1 == side2 && side2 == side3) {
      return "Equilateral Triangle";
    } else if (side1 == side2 || side1 == side3 || side2 == side3) {
      return "Isosceles Triangle";
    } else {
      return "Scalene Triangle";
    }
  }
}
