package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage extends BasePage{

		@FindBy(xpath = "//div[@class='service']")
		List<WebElement> mainMenuItem;
		

		public void selectMainMenuItem(String menuItem){
			for (WebElement item : mainMenuItem) {
						if (checkElementName(item, menuItem)){
							WebElement clickPlace = item.findElement(By.xpath("./*//a[not(@class)]"));
							new WebDriverWait(driver, 10)
									.until(ExpectedConditions.elementToBeClickable(clickPlace)).click();
							return;
						}
				}
			  Assert.fail("Не найден пункт меню - " + menuItem);
		}
		
		private boolean checkElementName(WebElement element, String name) {
			if(element.findElement(By.xpath("./*//div[@class='service__title-text']")).getText().equals(name)) {
				return true;
			}
			return false;
		}


}