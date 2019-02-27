package kyu8.Fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class mySolutionTest {
    @Test
    public void should_return_zero_for_zero(){
        Assert.assertEquals(0,mySoluction.fibonacci(0));
    }
    @Test
    public void should_return_8_for_6(){
        Assert.assertEquals(8,mySoluction.fibonacci(6));
    }
    @Test
    public void should_return_144_for_12(){
        Assert.assertEquals(144,mySoluction.fibonacci(12));
    }
    @Test
    public void should_return_4181_for_19(){
        Assert.assertEquals(4181,mySoluction.fibonacci(19));
    }
}