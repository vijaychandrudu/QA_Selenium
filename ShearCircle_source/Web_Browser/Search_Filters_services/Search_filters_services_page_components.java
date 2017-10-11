package Web_Browser.Search_Filters_services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Web_Browser.Web_Browser;

public class Search_filters_services_page_components {
	
	public Search_filters_services_page_objects SearchFilterservices;
	public WebDriver driver;
	public Search_filters_services_page_components(){
		SearchFilterservices = PageFactory.initElements(driver, Search_filters_services_page_objects.class);
	}
	Web_Browser webbrowser = new Web_Browser();

	public void Searchresults_select_Filters_checkbox(String p_in_filters){
		String filters_name = "";				
		try {
			String[] p_in_filters_list = p_in_filters.split(";");
		for(String filtercheckbox:p_in_filters_list) {
			for(WebElement Checkbox:SearchFilterservices.SR_Filters_checkbox_list){			
				filters_name = Checkbox.getText();
				if(filtercheckbox.equalsIgnoreCase(filters_name)) {					
					webbrowser.check_Checkbox(Checkbox);
					driver.wait(5);
					break;
				}
				
			}
		}
		
		int filter_checkboxcount = p_in_filters_list.length;
		
		int checked_checkboxcount = SearchFilterservices.SR_Filters_checkedcheckbox_list.size();
		
		if(filter_checkboxcount==checked_checkboxcount) {
			System.out.println("The given filters check boxes are selected");
		}else {
			System.out.println("The given filters check boxes are not selected");
		}
					
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	public void Searchresults_select_Services_checkbox(String p_in_Services){
		String Services_name = "";				
		try {
			String[] p_in_filters_list = p_in_Services.split(";");
		for(String filtercheckbox:p_in_filters_list) {
			for(WebElement Checkbox:SearchFilterservices.SR_Servies_checkbox_list){			
				Services_name = Checkbox.getText();
				if(filtercheckbox.equalsIgnoreCase(Services_name)) {					
					webbrowser.check_Checkbox(Checkbox);
					driver.wait(5);
					break;
				}
				
			}
		}
		
		int filter_checkboxcount = p_in_filters_list.length;
		
		int checked_checkboxcount = SearchFilterservices.SR_services_checkedcheckbox_list.size();
		
		if(filter_checkboxcount==checked_checkboxcount) {
			System.out.println("The given Services check boxes are selected");
		}else {
			System.out.println("The given Services check boxes are not selected");
		}
					
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	public void Searchresults_Ratings_checkbox_list(String p_in_Ratings){
		String Ratings_name = "";				
		try {
			String[] p_in_Ratings_list = p_in_Ratings.split(";");
		for(String Ratingscheckbox:p_in_Ratings_list) {
			for(WebElement Checkbox:SearchFilterservices.SR_Ratings_checkbox_list){			
				Ratings_name = Checkbox.getText();
				if(Ratingscheckbox.equalsIgnoreCase(Ratings_name)) {					
					webbrowser.check_Checkbox(Checkbox);
					driver.wait(5);
					break;
				}
				
			}
		}
		
		int Ratings_checkboxcount = p_in_Ratings_list.length;
		
		int checked_checkboxcount = SearchFilterservices.SR_services_checkedcheckbox_list.size();
		
		if(Ratings_checkboxcount==checked_checkboxcount) {
			System.out.println("The given Ratings check boxes are selected");
		}else {
			System.out.println("The given Ratings check boxes are not selected");
		}
					
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	


}
