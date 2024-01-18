import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.List;

@DefaultUrl("https://www.wikipedia.org/wiki/Wikipedia:Portada")
public class HomePage extends PageObject {

    @FindBy(css = "[name='search']")
    WebElementFacade searchInput;

    @FindBy(css= "#searchform button")
    WebElementFacade searchButton;

    @FindBy(css=".mw-page-title-main")
    WebElementFacade pageTitle;

    @FindBy(tagName = "a")
    List<WebElementFacade> links;

    public void searchText(String text){
        searchInput.type(text);
        searchButton.isPresent();
        searchButton.isClickable();
        searchButton.click();
    }

    public String getTitle(){
        return pageTitle.getText();
    }

    public List getLinks(){
        return links;
    }
}
