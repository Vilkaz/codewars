package romanNumeralsEncoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vkukanauskas on 29/07/2016.
 */
public class ConversionTest {

    @Test
    public void testZero() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(0);
        Assert.assertEquals("", result);
    }

    @Test
    public void testOne() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(1);
        Assert.assertEquals("I", result);
    }

    @Test
    public void testThree() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(3);
        Assert.assertEquals("III", result);
    }

    @Test
    public void testFour() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(4);
        Assert.assertEquals("IV", result);
    }

    @Test
    public void testSix() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(6);
        Assert.assertEquals("VI", result);
    }

    @Test
    public void testEight() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(8);
        Assert.assertEquals("VIII", result);
    }

    @Test
    public void testNine() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(9);
        Assert.assertEquals("IX", result);
    }

    @Test
    public void testTen() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(10);
        Assert.assertEquals("X", result);
    }

    @Test
    public void testEleven() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(11);
        Assert.assertEquals("XI", result);
    }

    @Test
    public void testFifteen() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(15);
        Assert.assertEquals("XV", result);
    }

    @Test
    public void testTwenty() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(20);
        Assert.assertEquals("XX", result);
    }

    @Test
    public void testFortiNine() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(49);
        Assert.assertEquals("XLIX", result);
    }

    @Test
    public void testOneHundrteSixtyNine() {
        Conversion conversion = new Conversion();
        String result = conversion.solution(169);
        Assert.assertEquals("CLXIX", result);
    }


}