import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import java.util.List;

public class WikipediaSteps {

    HomePage homePage;


    @Step
    public void openBrowser(){
        homePage.open();
    }

    @Step
    public void search(){
        homePage.searchText("Osorno, Chile");
    }

    @Step
    public void verifyResult(){
        Assert.assertEquals("El título NO coincide",homePage.getTitle(),"Osorno, Chile");
    }

    @Step
    public void printLinks(){

        List<WebElementFacade> links = homePage.getLinks();

        for (WebElementFacade link:links) {
            System.out.println(link);
        }
    }
}
