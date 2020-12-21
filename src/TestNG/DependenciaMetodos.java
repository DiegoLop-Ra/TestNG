package TestNG;

public class DependenciaMetodos {
    WebDriver driver;

    @Test
    public void test1_SetUpChrome()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver ();

        System.out.println("1. Set Up Chrome");
    }

    @Test
    public void test2_OpenOrangeHRM()
    {
        //Invalid URL
        driver.get("https://opensource-demo.orangehrmlive1234.com/");

        Assert.assertEquals(false, true, "Could Not Access OrangeHRM");
        System.out.println("2. Open OrangeHRM");
    }

    @Test
    public void test3_SignIn() {}

    @Test
    public void test4_SearchUser() {}

    @Test
    public void test5_SearchEmployee() {}

    @Test
    public void test6_SearchCandidate() {}

    @Test
    public void test7_SignOut() {}
}
