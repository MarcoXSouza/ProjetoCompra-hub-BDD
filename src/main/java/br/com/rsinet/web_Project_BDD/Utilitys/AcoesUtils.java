package br.com.rsinet.web_Project_BDD.Utilitys;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AcoesUtils {
	private static WebDriverWait wait;
	private WebDriver driver = DriverFactory.driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	
	public AcoesUtils(WebDriver driver2) {
		PageFactory.initElements(driver, this);	}

	public void esperaAte(WebElement element){
		wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void scroll() {
        js.executeScript("window.scrollBy(0,1000)");
	}

	public void clicaNext(WebElement element) {
		js.executeScript("arguments[0].click();", element);
	}

}
