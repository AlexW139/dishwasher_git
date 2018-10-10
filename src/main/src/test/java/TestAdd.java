// A unit test to determine whether the 'add' command adds the correct number of plates to the stack.

import com.company.Stack;
import com.company.StackFullException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdd {
    @Test
    public void testAdd() {
        // This is what the stack should look like after 6 plates have been added
        String[] expected = {"dirty", "dirty", "dirty", "dirty", "dirty", "dirty", "empty", "empty", "empty", "empty"};

        // Construct the actual stack as it would be in the main method
        Stack testStack = new Stack(10);
        int plts_in = 6;
        try {
            for (int i = 1; i < plts_in + 1; i++) {
                testStack.push("dirty");
            }
        } catch (StackFullException exc) {
            System.out.println(exc);
        }
        Stack actual = testStack;

        // Compare the each entry in the actual and expected arrays using 'assert'
        for(int i=0; i<actual.getLength(); i++) {
            Assert.assertEquals(actual.getEntry(i), expected[i]);
        }
    }
}
