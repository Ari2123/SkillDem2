import org.junit.*;
import static org.junit.Assert.*;

public class AdditionTest2 {

    @Test
	public void testAddition() {
		int a = 5;
        int b = 10;

        assertEquals("Should return 15", 12, Addition2.sum(5, 10));
	}
}
