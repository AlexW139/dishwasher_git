import com.company.Stack;
import com.company.StackEmptyException;
import com.company.StackFullException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGet {
    @Test
    public void testGet() {
        // This is what the stack should look like after 8 plates were removed from a full stack of clean plates
        String[] expected = {"clean", "clean", "empty", "empty", "empty", "empty", "empty", "empty", "empty", "empty"};

        // Construct the actual stack as it would be in the main method
        Stack testStack = new Stack(10);
        int plts_in = 10;
        try {
            for (int i = 1; i < plts_in + 1; i++) {
                testStack.push("clean");
            }
        } catch (StackFullException exc) {
            System.out.println(exc);
        }
        // Remove 8 plates using 'get'
        int plts_out = 8;
        try {
            for (int i = 0; i < plts_out; i++) {
                testStack.pop();
            }
        } catch (StackEmptyException exc) {
            System.out.println(exc);
        }
        Stack actual = testStack;

        // Compare the each entry in the actual and expected arrays using 'assert'
        for(int i=0; i<actual.getLength(); i++) {
            Assert.assertEquals(actual.getEntry(i), expected[i]);
        }
    }
}
