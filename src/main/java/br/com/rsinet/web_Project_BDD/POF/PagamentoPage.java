package br.com.rsinet.web_Project_BDD.POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.web_Project_BDD.Utilitys.DriverFactory;
import br.com.rsinet.web_Project_BDD.Utilitys.ExcelUtils;

public class PagamentoPage {
	public PagamentoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "save_safepay")
	private WebElement salvarDados;

	@FindBy(name = "safepay_password")
	private WebElement senhaSafePay;

	@FindBy(name = "safepay_username")
	private WebElement usuarioSafePay;

	@FindBy(id = "pay_now_btn_SAFEPAY")
	private WebElement pagar;

	public void getSalvarDados() {
		salvarDados.click();
	}

	public void getUsuarioSafePay() {
		usuarioSafePay.click();
		usuarioSafePay.clear();
		usuarioSafePay.sendKeys(ExcelUtils.getCellData(2, 2));
	}
	
	public void getSenhaSafePay() {
		senhaSafePay.click();
		senhaSafePay.clear();
		senhaSafePay.sendKeys(ExcelUtils.getCellData(2, 3));
	}

	public void getPagar() {
		pagar.click();
	}

	public String sucesso() {
		return DriverFactory.driver.getCurrentUrl();
	}

}
