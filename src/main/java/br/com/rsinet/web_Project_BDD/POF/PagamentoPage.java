package br.com.rsinet.web_Project_BDD.POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.web_Project_BDD.Utilitys.DriverFactory;
import br.com.rsinet.web_Project_BDD.Utilitys.ExcelUtils;

public class PagamentoPage {
	private WebDriver driver = DriverFactory.driver;
	public PagamentoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "save_safepay")
	private WebElement salvarDados;

	@FindBy(name = "safepay_password")
	private WebElement senhaSafePay;

	@FindBy(name = "safepay_username")
	public WebElement usuarioSafePay;

	@FindBy(id = "pay_now_btn_SAFEPAY")
	private WebElement pagar;

	@FindBy(xpath = "//*[@id=\"paymentMethod\"]/div/div[2]/sec-form/sec-view[2]/div/label")
	private WebElement msgSenhaInvalida;

	@FindBy(id = "menuHelp")
	private WebElement ajuda;

	public void getSalvarDados() {
		salvarDados.click();
	}

	public void getUsuarioSafePay() {
		usuarioSafePay.clear();
		usuarioSafePay.sendKeys(ExcelUtils.getCellData(2, 2));
	}

	public void getSenhaSafePay() {
		senhaSafePay.clear();
		senhaSafePay.sendKeys(ExcelUtils.getCellData(2, 3));
	}

	public void getPagar() {
		pagar.click();
	}

	public String sucesso() {
		return DriverFactory.driver.getCurrentUrl();
	}

	public void getSenhaSafePayInvalida() {
		senhaSafePay.sendKeys(ExcelUtils.getCellData(2, 3));
	}

	public String getMsgSenhaInvalida() {
		return msgSenhaInvalida.getText();
	}

	public WebElement ajuda() {
		return ajuda;
	}
	public String pageSource() {
		return driver.getPageSource();
	}

}
