package Web_Browser.search_Bookme;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class search_Bookme {

	@FindBy(xpath="//*[@id='myRating0']/span ")
    public List<WebElement> SR_Bookme_Rating;

	@FindBy(xpath="//*[@id='searchResultsContainerBox']/div[2]//div[@class='location ng-binding'] ")
    public List<WebElement> SR_Bookme_address;

	@FindBy(xpath="//*[@id='searchResultsContainerBox']/div[3]/div[1]/div[1]/div/ul/li ")
    public List<WebElement> SR_Bookme_paymentmode;

	@FindBy(xpath="//*[@id='searchResultsContainerBox']/div/div/div/ul/li/a ")
    public List<WebElement> SR_Bookme_time;

	@FindBy(xpath="//*[@id='searchResultsContainerBox']/div[2]//h3[@class='ng-binding'] ")
    public List<WebElement> SR_Bookme_PFName;
	
	@FindBy(xpath="//*[@id='searchResultsContainerBox']/div[2]//a[@class='btn_1'] ")
    public List<WebElement> SR_Bookme_Button;
}
