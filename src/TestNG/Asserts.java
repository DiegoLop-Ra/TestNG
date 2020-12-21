package TestNG;

public class Asserts {

        Assert.assertEquals(true, false, "The Welcome Link Is Not Correct On The Home Page");
    System.out.println("3. Verify Welcome Link");

    Assert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");
    System.out.println("4. Verify Admin Tab");

    Assert.assertTrue(false, "The Dashboard Is Not Correct On The Home Page");
    System.out.println("5. Verify Dashboard");

        softassert.assertEquals(true, false, "The Welcome Link Is Not Correct On The Home Page");
        System.out.println("3. Verify Welcome Link");

        softassert.assertFalse(false, "The Admin Tab Is Not Displayed On The Home Page");
        System.out.println("4. Verify Admin Tab");

        softassert.assertTrue(false, "The Dashboard Is Not Correct On The Home Page");
        System.out.println("5. Verify Dashboard")
}
