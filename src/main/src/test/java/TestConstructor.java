import org.testng.Assert;
import org.testng.annotations.Test;

public class TestConstructor {
    @Test
    public void testConstructor() {
        String[] expected = {"empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty","empty"};

        int size = 15;
        String[] actual = new String[size];
        for(int i=0; i<size; i++) actual[i] = "empty";

        Assert.assertEquals(actual, expected);
    }
}
