package decompose;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vkukanauskas on 02/08/2016.
 */
public class DecomposeTest {

    @Test
    public void test1() {
        Decompose decompose = new Decompose();
        long n = 11;
        assertEquals("1 2 4 10",  decompose.decompose(n));
    }

}