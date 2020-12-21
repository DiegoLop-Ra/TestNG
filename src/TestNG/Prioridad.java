package TestNG;

public class Prioridad {
    @BeforeClass
    public void setUp() {}

    @Test (priority = 1)
    public void signIn() {}

    @Test (priority = 2)
    public void searchTShirt() {}

    @Test (priority = 3)
    public void signOut() {}

    @AfterClass
    public void tearDown() {}
}
