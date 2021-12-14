package cleancode.largeclass;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.Assert.*;

public class GameTest {

  @Test public void
  gameTest() {
    Queue<Integer> rollsSequence = new LinkedList<>(Arrays.asList(
        6, 9, 2, 4, 7, 0, 5, 1, 0, 2, 8, 4, 2, 3, 8, 1, 2, 5, 1, 7, 8, 4, 5, 7, 8, 1, 3, 1, 9, 2, 9, 6, 2, 2, 1, 0, 2, 6, 1, 2, 8, 9, 7, 1, 3, 5, 2, 5, 1, 3
    ));

    // Create a stream to hold the output
    ByteArrayOutputStream capturedOutput = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(capturedOutput);
    // IMPORTANT: Save the old System.out!
    PrintStream old = System.out;
    // Tell Java to use your special stream
    System.setOut(ps);
    boolean notAWinner;
    var aGame = new Game();

    aGame.add("Chet");
    aGame.add("Pat");
    aGame.add("Sue");

    do {
      aGame.roll(rollsSequence.remove());

      if (rollsSequence.remove() == 7) {
        notAWinner = aGame.wrongAnswer();
      } else {
        notAWinner = aGame.wasCorrectlyAnswered();
      }

    } while (notAWinner);

    // Put things back
    System.out.flush();
    System.setOut(old);

    var actualLines = capturedOutput.toString().split(System.lineSeparator());
    var expectedLines = goldenMaster();
    for (var i = 0; i < actualLines.length; i++)
    {
      assertEquals("Line "+ i + "diff", expectedLines[i], actualLines[i]);
    }
    assertEquals("Different lengths", expectedLines.length, actualLines.length);
  }

  private String[] goldenMaster() {
    return new String[]{"Chet was added",
    "They are player number 1",
    "Pat was added",
    "They are player number 2",
    "Sue was added",
    "They are player number 3",
    "Chet is the current player",
    "They have rolled a 6",
    "Chet's new location is 6",
    "The category is Sports",
    "Sports Question 0",
    "Answer was correct!!!!",
    "Chet now has 1 Gold Coins.",
    "Pat is the current player",
    "They have rolled a 2",
    "Pat's new location is 2",
    "The category is Sports",
    "Sports Question 1",
    "Answer was correct!!!!",
    "Pat now has 1 Gold Coins.",
    "Sue is the current player",
    "They have rolled a 7",
    "Sue's new location is 7",
    "The category is Rock",
    "Rock Question 0",
    "Answer was correct!!!!",
    "Sue now has 1 Gold Coins.",
    "Chet is the current player",
    "They have rolled a 5",
    "Chet's new location is 11",
    "The category is Rock",
    "Rock Question 1",
    "Answer was correct!!!!",
    "Chet now has 2 Gold Coins.",
    "Pat is the current player",
    "They have rolled a 0",
    "Pat's new location is 2",
    "The category is Sports",
    "Sports Question 2",
    "Answer was correct!!!!",
    "Pat now has 2 Gold Coins.",
    "Sue is the current player",
    "They have rolled a 8",
    "Sue's new location is 3",
    "The category is Rock",
    "Rock Question 2",
    "Answer was correct!!!!",
    "Sue now has 2 Gold Coins.",
    "Chet is the current player",
    "They have rolled a 2",
    "Chet's new location is 1",
    "The category is Science",
    "Science Question 0",
    "Answer was correct!!!!",
    "Chet now has 3 Gold Coins.",
    "Pat is the current player",
    "They have rolled a 8",
    "Pat's new location is 10",
    "The category is Sports",
    "Sports Question 3",
    "Answer was correct!!!!",
    "Pat now has 3 Gold Coins.",
    "Sue is the current player",
    "They have rolled a 2",
    "Sue's new location is 5",
    "The category is Science",
    "Science Question 1",
    "Answer was correct!!!!",
    "Sue now has 3 Gold Coins.",
    "Chet is the current player",
    "They have rolled a 1",
    "Chet's new location is 2",
    "The category is Sports",
    "Sports Question 4",
    "Question was incorrectly answered",
    "Chet was sent to the penalty box",
    "Pat is the current player",
    "They have rolled a 8",
    "Pat's new location is 6",
    "The category is Sports",
    "Sports Question 5",
    "Answer was correct!!!!",
    "Pat now has 4 Gold Coins.",
    "Sue is the current player",
    "They have rolled a 5",
    "Sue's new location is 10",
    "The category is Sports",
    "Sports Question 6",
    "Question was incorrectly answered",
    "Sue was sent to the penalty box",
    "Chet is the current player",
    "They have rolled a 8",
    "Chet is not getting out of the penalty box",
    "Pat is the current player",
    "They have rolled a 3",
    "Pat's new location is 9",
    "The category is Science",
    "Science Question 2",
    "Answer was correct!!!!",
    "Pat now has 5 Gold Coins.",
    "Sue is the current player",
    "They have rolled a 9",
    "Sue is getting out of the penalty box",
    "Sue's new location is 7",
    "The category is Rock",
    "Rock Question 3",
    "Answer was correct!!!!",
    "Sue now has 4 Gold Coins.",
    "Chet is the current player",
    "They have rolled a 9",
    "Chet is getting out of the penalty box",
    "Chet's new location is 11",
    "The category is Rock",
    "Rock Question 4",
    "Answer was correct!!!!",
    "Chet now has 4 Gold Coins.",
    "Pat is the current player",
    "They have rolled a 2",
    "Pat's new location is 11",
    "The category is Rock",
    "Rock Question 5",
    "Answer was correct!!!!",
    "Pat now has 6 Gold Coins."};
  }

}