package examples.list;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ListTest {

  @Test public void
  Should_return_multiple_values_of_list_size() {
    List mockList = mock(List.class);
    when(mockList.size()).thenReturn(1);

    assertEquals(1, mockList.size());
  }
}
