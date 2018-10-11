import company.NegativeInputException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNegativeInputException {
    @Test
    public void testNegativeInputException() {
        String expected = "*** Error: Please enter a positive integer ***";
        String actual = "";

        int input = -5;

        try {
            if(input < 0) throw new NegativeInputException();
        } catch (NegativeInputException exc) {
            actual = "*** Error: Please enter a positive integer ***";
        }

        Assert.assertEquals(actual, expected);
    }
}
