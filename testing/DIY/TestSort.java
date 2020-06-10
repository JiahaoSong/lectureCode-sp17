import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the methods of the Sort class */
public class TestSort {
	@Test
	public void testSort()
	{
		String[] input = {"i", "have", "a", "dream"};
		String[] expected = {"a", "dream", "have", "i"};
		Sort.sort(input);
		Sort.print(input);
		assertArrayEquals(expected, input);

	}
	public static void main(String[] args) {

	}
}