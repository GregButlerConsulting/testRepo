package src.test.java;

import org.junit.Test;
import src.main.java.HelloWorldOne;

/**
 * Created by Greg on 07/04/2014.
 */
public class TestHello {

    private HelloWorldOne helloWorldOne;
    @Test
    public void TestHello() {
        helloWorldOne = new HelloWorldOne();
        assert(helloWorldOne.getTheWord().equals(HelloWorldOne.NOBODY));
    }
}
