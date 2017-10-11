package Web_Browser.selon_services;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selon_services_page_objects {
	@FindBy(xpath="//*[@id='container_pin']/div/ul/li/a/i")
    public List<WebElement> Selon_Container_tabs_list;
	
	@FindBy(xpath="//*[@id='services']/div/div/div/div/div/h2['Book Services']")
    public WebElement Selon_Book_services_title;
	
	@FindBy(xpath="//li/a[@aria-controls='overview']")
    public List<WebElement> Selon_overview;
	
	@FindBy(xpath="//*[@id='container_pin']/div/ul/li/a[@aria-controls='reviews']")
    public List<WebElement> Selon_reviews;

	@FindBy(xpath="//li/a[@aria-controls='feedbacks']")
    public List<WebElement> Selon_inquiry;

	@FindBy(xpath="//li/a[@href='#promotions']")
    public List<WebElement> Selon_promotions;

	@FindBy(xpath="//li/a[@aria-controls='videos']")
    public List<WebElement> Selon_videos;
	
	@FindBy(xpath="//li/a[@href='#photos']")
    public List<WebElement> Selon_photos;
	
	@FindBy(xpath="//*[@id='contact_us_tab']")
    public List<WebElement> Selon_contactus;
	
	@FindBy(xpath="//li/a[@href='#jobs']")
    public List<WebElement> Selon_jobs;
	
	@FindBy(xpath="//div/button[@class='btn btn-primary btn-lg pull-right']")
    public List<WebElement> Selon_booknow;

	@FindBy(xpath="//div[1]/div[1]/div/label/input[@class='ichecks service_item']")
    public List<WebElement> Selon_haircut_checkbox;

	@FindBy(xpath="//div[2]/div/div[1]/div[2]//div[1]/label/input[@data-amount='5']")
    public List<WebElement> Selon_braiding_checkbox;

	@FindBy(xpath="//div[2]/div/div[1]/div[3]/div[1]/label/input")
    public List<WebElement> Selon_coloring_checkbox;

	



}
