import net.serenitybdd.annotations.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WikipediaTest {

    @Steps
    WikipediaSteps wikipediaSteps;

    @Managed
    WebDriver driver;

    @Test
    public void searchOsorno(){
        //Step 1 = open chrome
        wikipediaSteps.openBrowser();
        //Step 2 = search "Osorno"
        wikipediaSteps.search();
        //step 3 = verify result
        wikipediaSteps.verifyResult();
        wikipediaSteps.printLinks();
    }

    /*@Test
    public void showLinks(){
        //Step 1 = open chrome
        wikipediaSteps.openBrowser();
        //Step 2 = search "Osorno"
        wikipediaSteps.search();
        //Step 3 = print links
    }*/
}
