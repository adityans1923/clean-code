package cleancode.comments;

public class Matcher {
  public Matcher() {}

  public boolean match(int[] expected, int[] actual,
                       int clipLimit, int delta) {
// Clip "too-large" values
    clipTooLargeValues(actual, clipLimit);
// Check for length differences
    if (isLengthEqual(expected, actual))
      return false;
// Check that each entry is within expected +/- delta
    for (int i = 0; i < actual.length; i++)
      if (Math.abs(expected[i] - actual[i]) > delta)
        return false;
    return true;
  }

  private boolean isLengthEqual(int[] expected, int[] actual) {
    return actual.length != expected.length;
  }

  private void clipTooLargeValues(int[] actual, int clipLimit) {
    for (int i = 0; i < actual.length; i++)
      if (actual[i] > clipLimit)
        actual[i] = clipLimit;
  }
}
