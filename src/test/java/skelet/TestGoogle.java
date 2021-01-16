package skelet;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestGoogle {
    public MyStepdefs step = new MyStepdefs();


    @BeforeTest
    public void setUp() {
        step.openGooglePage();
    }

    @Test
    public void testNumber() {
        step.clickOnButton();
        Assert.assertTrue(step.iVerifyThatTheDateIsPresent());

    }

    @AfterTest
    public void tearDown() {
        step.closeChrome();
    }
}

