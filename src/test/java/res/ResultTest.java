package res;

import result.Result;
import org.testng.Assert; 
import org.testng.annotations.Test;

public class ResultTest{

    @Test
    public void testPass() {
        Assert.assertEquals(Result.display(65), "pass");
    }

    @Test
    public void testFail() {
        Assert.assertEquals(Result.display(16), "fail");
    }

    @Test
    public void testInvalid() {
        Assert.assertEquals(Result.display(105), "Invalid");
    }
}  