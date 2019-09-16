package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositPage extends BasePage{
	
	@FindBy(xpath = "//label[@class='calculator__currency-field']")
	List<WebElement> currencies;
	
	public void selectCurrency(String currencyName) {
		for (WebElement webElement : currencies) {
			System.out.println();
			System.out.println();
			System.out.println("value = " + webElement.findElement(By.xpath(".//input")).getAttribute("value"));
			System.out.println();
			System.out.println();
			if(webElement.findElement(By.xpath(".//input")).getAttribute("value").equalsIgnoreCase(currencyName)) {
				webElement.findElement(By.xpath(".//span[@class='calculator__currency-field-btn']")).click();
				return;
			}
		}
	}
	
}

