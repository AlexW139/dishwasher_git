// A test for the acceptedCommands() method to make sure it returns the correct command

import com.company.AcceptedCommands;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TestCommand {
    @Test
    public void testCommand() {
        // If we enter the command word 'clean', we expect the method to return 'clean' since it is an acceptable command
        String expected = "clean";

        // Now let's return it the actual way as if the user had entered the word 'clean'
        String userCommand = "clean";
        String actual = AcceptedCommands.acceptCommand(userCommand);

        // Check that the method has returned the word unchanged
        Assert.assertEquals(actual, expected);
    }
}
