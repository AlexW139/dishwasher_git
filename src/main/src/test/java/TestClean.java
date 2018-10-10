import com.company.Stack;
import com.company.StackFullException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClean {
    @Test
    public void testClean() {
        // This is what the stack should look like after 10 plates have been added and cleaned
        String[] expected = {"clean", "clean", "clean", "clean", "clean", "clean", "clean", "clean", "clean", "clean"};

        // Construct the actual stack as it would be in the main method
        Stack testStack = new Stack(10);
        int plts_in = 10;
        try {
            for (int i = 1; i < plts_in + 1; i++) {
                testStack.push("dirty");
            }
        } catch (StackFullException exc) {
            System.out.println(exc);
        }
        // Clean any plates that are currently in the washer
        for (int i = 0; i < testStack.getLength(); i++) {
            if (testStack.getEntry(i).equals("empty")) {
                break;
            } else testStack.setEntry(i, "clean");
        }
        Stack actual = testStack;

        // Compare the each entry in the actual and expected arrays using 'assert'
        for(int i=0; i<actual.getLength(); i++) {
            Assert.assertEquals(actual.getEntry(i), expected[i]);
        }
    }
}
