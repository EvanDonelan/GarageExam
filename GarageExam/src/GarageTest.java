import junit.framework.TestCase;

public class GarageTest extends TestCase {
    //Test #: 1
    //Objective: Test Range Hours > 9 || Hours < 10.9
    //Input(s): Hours = 9.1
    //Expected O/P: "Cost is 4.50";

    public void testgetDescription001(){

        double result = 0.0;
        Garage testObj = new Garage(9.1);

        try {
                result = testObj.Hours(9.1);
        }
        catch (GarageExceptionHandler e) {
                assertEquals("Values outside of range", e.getMessage());
        }

    }

    //Test #2
    //Objective:Test Range Hours (3>=Hours>0)
    //Input(s): Hours = 2.1
    //Expected o/p: "Cost is 2 Euro"
    public void testgetDescription002() throws GarageExceptionHandler {
        Garage testobj2 = new Garage(1.2);

        assertEquals("Cost is 2.00" , testobj2.getDescription());
    }

    //Test #3
    //Objective:Test Range Hours (Hours < 0)
    //Input(s): Hours = -1.0
    //Expected o/p: "Invalid input try again."
    public void testgetDescription003() throws GarageExceptionHandler {
        Garage testobj3 = new Garage(-1.0);

        assertEquals("Invalid input try again.", testobj3.getDescription());
    }

    //Test #4
    //Objective:Test Range Hours (Hours > 24)
    //Input(s): Hours = 26
    //Expected o/p: "Invalid input try again."
    public void testgetDescription004() throws GarageExceptionHandler {
        Garage testobj4 = new Garage(26.0);

        assertEquals("Invalid input try again.", testobj4.getDescription());
    }

    //Test #5
    //Objective:Test 10 euro cap
    //Input(s): Hours = 24
    //Expected o/p: "Cost is 10.0"
    public void testgetDescription005() throws GarageExceptionHandler {
        Garage testobj5 = new Garage(24.0);

        assertEquals("Cost is 10.0", testobj5.getDescription());
    }


}