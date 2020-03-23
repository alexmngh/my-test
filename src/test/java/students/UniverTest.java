package students;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniverTest {

  @AfterEach
  void tearDown() {
  }

  @Test
  void sumVal() {
    Univer univer = new Univer();
    int actual = univer.sumVal(5);
    int expected = 10;
    assertEquals(expected, actual);
    actual = univer.sumVal(4);
    expected = 6;
    assertEquals(expected, actual);
  }
}