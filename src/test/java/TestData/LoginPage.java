package TestData;

import PageObjects.SignOutPage;
import TestComponents.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class LoginPage extends BaseTest {
    @Test(dataProvider = "getData")
    public void LoginPage(HashMap<String, String> input) throws IOException {

        SignOutPage signOutPage = landingPage.LoginApplication(input.get("email"),input.get("password"));
        signOutPage.SignOut();
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        List<HashMap<String, String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test/java//InputData//loginPage.json");
        return new Object[][] {{data.get(0)}};

    }
}


