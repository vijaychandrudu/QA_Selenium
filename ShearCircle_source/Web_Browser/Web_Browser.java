package Web_Browser;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;


public class Web_Browser {
	
	public boolean elmentisdisplayed(WebElement element){
		boolean elementdisplayedflag = false;
		try{
			if(element.isDisplayed() && element.isEnabled()) {
				elementdisplayedflag = true; 
			}else {
				System.out.println("Element existance and enabled status Failed");
			}
			
		}catch(Exception e){
			System.out.println("Error in description: " + e.getStackTrace() );
		}
		return elementdisplayedflag;
		
	}
	
	public String elementgetAttributevalue(WebElement element, String p_in_propertyname){
		String attributevalue="";
		try{
			if(element.isDisplayed()) {
			  attributevalue = element.getAttribute(p_in_propertyname); 
			}else {
				System.out.println("Element existance and enabled status Failed");
			}
			
		}catch(Exception e){
			System.out.println("Error in description: " + e.getStackTrace() );
		}
		return attributevalue;
		
	}
	
	public String elementgettext(WebElement element){
		String textvalue="";
		try{
			if(element.isDisplayed()) {
				textvalue = element.getText(); 
			}else {
				System.out.println("Element existance and enabled status Failed");
			}
			
		}catch(Exception e){
			System.out.println("Error in description: " + e.getStackTrace() );
		}
		return textvalue;
		
	}
	

	
	public void sendkeys(WebElement element, String p_in_inputvalue){
		try{
			if(element.isDisplayed() && element.isEnabled()) {
				element.sendKeys(p_in_inputvalue);
			}else {
				System.out.println("Element existance and enabled status Failed");
			}

		}catch(Exception e){
			System.out.println("Error in description: " + e.getStackTrace() );
		}
				
	}
	
	public void check_Checkbox(WebElement element){
		try{
			if(element.isDisplayed() && element.isEnabled()) {
				element.click();;
			}else {
				System.out.println("Check box existance and enabled status Failed");
			}
		}catch(Exception e){
			System.out.println("Error in description: " + e.getStackTrace() );
		}	
	}
	
	public void click(WebElement element){
		try{
			if(element.isDisplayed() && element.isEnabled()) {
				element.click();;
			}else {
				System.out.println("Element existance and enabled status Failed");
			}
		}catch(Exception e){
			System.out.println("Error in description: " + e.getStackTrace() );
		}
		
	}
	
	public void select_Dropdownvalue(WebElement element, String p_in_inputvalue){
		try{
			if(element.isDisplayed() && element.isEnabled()) {
				Select dropdown = new Select(element);
				dropdown.selectByVisibleText(p_in_inputvalue);
			}else {
				System.out.println("Element existance and enabled status Failed");
			}
		}catch(Exception e){
			System.out.println("Error in description: " + e.getStackTrace() );
		}
		
	}


}
