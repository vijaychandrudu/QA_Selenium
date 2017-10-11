package Web_Browser.selon_services;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Web_Browser.Web_Browser;

public class Selon_Page_Components {
	public selon_services_page_objects s_services;
	public WebDriver driver;
	public Selon_Page_Components(){
		s_services = PageFactory.initElements(driver, selon_services_page_objects.class);
	}
	Web_Browser webbrowser = new Web_Browser();
	public void select_selon_container_tab(String p_in_TabName){
		String seloncontainer_tabname = "";
		WebElement selon_tabname = null;
		boolean selon_tab_flag = false;
		try {
		for(WebElement tabname:s_services.Selon_Container_tabs_list){
			
			seloncontainer_tabname = tabname.getText();
			if(seloncontainer_tabname.equalsIgnoreCase(p_in_TabName)) {
				selon_tabname = tabname;
				selon_tab_flag = true;
			}
			
		}
		if(selon_tab_flag){
			switch(p_in_TabName){	
				case "Services":
					selon_tabname.click();
					driver.wait(5);
					if(s_services.Selon_Book_services_title.isDisplayed()) {
						System.out.println("The given tab selected");
					}else {
						System.out.println("The given tab Not selected");
					}
				
			}
		}
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	
}
