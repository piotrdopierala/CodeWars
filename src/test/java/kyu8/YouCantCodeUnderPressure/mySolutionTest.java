package kyu8.YouCantCodeUnderPressure;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public final void test_all() {
        Assert.assertEquals( "Nope!" , 4, mySolution.doubleInteger(2));
    }
}