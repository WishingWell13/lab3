import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlaceLongArr() {
    int[] input1 = { 3, 5, 9 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9, 5, 3 }, input1);
    
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedLongArr() {
    int[] input1 = { 5, 9, 13};
    assertArrayEquals(new int[]{ 13, 9, 5}, ArrayExamples.reversed(input1));
  }
}
