import org.junit.Before;
import org.junit.Test;

import java.sql.SQLOutput;

import static org.junit.Assert.assertEquals;

public class MethodsTest {

    Customer test;

    @Before
    public void setUp() {
        test = new Customer("Alex", 33450, 400, 400);

    }

    @Test
    public void testDepositToString(){
    assertEquals(System.out.println(test.Deposit), "Deposit of: " + 400 + "Date: " + 400 + "into account: " + "Checking");
    }


}
