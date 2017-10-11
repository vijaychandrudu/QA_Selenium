package Web_Browser.Search_Filters_services;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_filters_services_page_objects {
	
	@FindBy(xpath="//*[@id='collapseFilters']/div[1]/div[1]/ul/li/label/div/input")
    public List<WebElement> SR_Filters_checkbox_list;
	
	@FindBy(xpath="//*[@id='collapseFilters']/div[1]/div[1]/ul/li/label/div[@class='icheckbox_square-grey checked']/input")
    public List<WebElement> SR_Filters_checkedcheckbox_list;
	
	@FindBy(xpath="//*[@id='niceScroll']/li//div/input")
    public List<WebElement> SR_Servies_checkbox_list;
	
	@FindBy(xpath="//*[@id='niceScroll']/li//div[@class='icheckbox_square-grey checked']/input")
    public List<WebElement> SR_services_checkedcheckbox_list;
	
	@FindBy(xpath="//*[@id='collapseFilters']/div/h6[text()='Rating']/parent::div/ul/li//input")
    public List<WebElement> SR_Ratings_checkbox_list;

	@FindBy(xpath="//*[@id='collapseFilters']/div/h6[text()='Rating']/parent::div/ul/li//div[@class='icheckbox_square-grey checked']/input")
    public List<WebElement> SR_Ratings_checkedcheckbox_list;


}
