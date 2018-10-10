import org.testng.Assert;
import org.testng.annotations.Test;
import com.company.Stack;

public class TestConstructor {
    @Test
    public void testConstructor() {
        String[] expected = {"empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty"};

        Stack actual = new Stack(15);

        for(int i=0; i<actual.getLength(); i++) {
            Assert.assertEquals(actual.getEntry(i), expected[i]);
        }
    }
}
