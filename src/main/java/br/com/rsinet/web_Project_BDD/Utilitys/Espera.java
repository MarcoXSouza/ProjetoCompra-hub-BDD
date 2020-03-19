package br.com.rsinet.web_Project_BDD.Utilitys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Espera {
	private static WebDriverWait wait;
	private WebDriver driver = DriverFactory.driver;
	
	public Espera(WebDriver driver2) {
		PageFactory.initElements(driver, this);	}

	public void ate(WebElement element){
		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}


}
