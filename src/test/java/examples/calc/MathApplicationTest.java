package examples.calc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

  @Test public void
  test_add() {
    MathApplication app = new MathApplication();
    double sum = app.add(10, 20);
    assertEquals(30, sum, 0.0);
  }
}