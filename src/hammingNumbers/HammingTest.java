package hammingNumbers;

        import org.junit.Assert;
        import org.junit.Test;

        import static org.junit.Assert.*;

/**
 * Created by vkukanauskas on 29/07/2016.
 */
public class HammingTest {

    @Test
    public void testFirst(){
        Assert.assertEquals(1, Hamming.hamming(1));
    }
    @Test
    public void testSecond(){
        Assert.assertEquals(2, Hamming.hamming(2));
    }
    @Test
    public void testThird(){
        Assert.assertEquals(3, Hamming.hamming(3));
    }

    @Test
    public void testForth(){
        Assert.assertEquals(4, Hamming.hamming(4));
    }

    @Test
    public void testFifth(){
        Assert.assertEquals(5, Hamming.hamming(5));
    }
    @Test
    public void testSix(){
        Assert.assertEquals(6, Hamming.hamming(6));
    }

}