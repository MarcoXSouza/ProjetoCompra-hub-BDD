package br.com.rsinet.web_Project_BDD.POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	public void getSenhaSafePay() {
		senhaSafePay.clear();
		senhaSafePay.sendKeys("aA123");
	}

	public void getUsuarioSafePay() {
		usuarioSafePay.clear();
		usuarioSafePay.sendKeys("marcos");
	}

	public void getPagar() {
		pagar.click();
	}

}
