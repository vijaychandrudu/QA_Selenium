package Web_Browser.Searchresult;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchresults_page_Objects {
	@FindBy(xpath="//div[@class='filter_type']/div[1]/ul/li/label/div/input")
    public List<WebElement> SR_filters_checkbox_List;
	
	
}
