package java3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMetod {
    Main mn;

    @Before
    public void doTestMain(){
        mn = new Main();
    }

    @Test
    public void testArr1тиро(){
        Assert.assertArrayEquals(new int[]{3,3,3}, mn.doAfterFour(new int[]{3,4,3,3,3}));
    }
    @Test
    public void testArr2(){
        Assert.assertArrayEquals(new int[]{3,5,3,3,3}, mn.doAfterFour(new int[]{34,3,4,3,5,3,3,3}));
    }
    @Test
    public void testArr3(){
        Assert.assertArrayEquals(new int[]{7,6,3,5,3,3,3}, mn.doAfterFour(new int[]{4,7,6,3,5,3,3,3}));
    }
    @Test
    public void testArr4(){
        Assert.assertArrayEquals(new int[]{2,3,6,2,532,6,2,6,64,23,3}, mn.doAfterFour(new int[]{2,4,26,4,2,3,6,2,532,6,2,6,64,23,3}));
    }
    @Test
    public void testTrueOrFalse1(){
        Assert.assertTrue(Main.isOneAndFour(new int[]{4,1,4,4,4}));
    }
    @Test
    public void testTrueOrFalse2(){
        Assert.assertTrue(Main.isOneAndFour(new int[]{4,342,4464,43,2,4}));
    }
    @Test
    public void testTrueOrFalse3(){
        Assert.assertTrue(Main.isOneAndFour(new int[]{4,1,445,2,1,3,5,5,4,4}));
    }
    @Test
    public void testTrueOrFalse4(){
        Assert.assertTrue(Main.isOneAndFour(new int[]{4,1,4,4,4,4,4,1,1,1,1,1,4,4,4}));
    }
}
