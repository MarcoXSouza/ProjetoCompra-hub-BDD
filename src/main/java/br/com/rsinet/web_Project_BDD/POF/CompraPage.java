package br.com.rsinet.web_Project_BDD.POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompraPage {
	public CompraPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "speakersImg")
	private WebElement item;

	@FindBy(linkText = "HP Roar Wireless Speaker")
	private WebElement produtoEscolhido;

	@FindBy(name = "save_to_cart")
	private WebElement adcAoCarrinho;

	@FindBy(id = "checkOutPopUp")
	private WebElement chkOutPopUp;

	@FindBy(id = "next_btnundefined")
	private WebElement btnNext;

	@FindBy(id = "next_btn")
	private WebElement btnNextPage;

	@FindBy(name = "save_safepay")
	private WebElement salvarDados;

	@FindBy(name = "safepay_password")
	private WebElement senhaSafePay;

	@FindBy(name = "safepay_username")
	private WebElement usuarioSafePay;

	@FindBy(id = "pay_now_btn_SAFEPAY")
	private WebElement pagar;

	public void getItem() {
		item.click();
	}

	public void getProdutoEscolhido() {
		produtoEscolhido.click();
	}

	public void getAdcAoCarrinho() {
		adcAoCarrinho.click();
	}

	public void getChkOutPopUp() {
		chkOutPopUp.click();
	}

//	public WebElement getBtnNext() {
//		return btnNext;
//	}

	public void getSalvarDados() {
		salvarDados.click();
	}

	public void getSenhaSafePay() {
		senhaSafePay.click();
	}

	public void getUsuarioSafePay() {
		usuarioSafePay.click();
	}

	public void getPagar() {
		pagar.click();
	}

	public WebElement getBtnNextPage() {
		return btnNext;
//		btnNextPage.click();
	}
}
