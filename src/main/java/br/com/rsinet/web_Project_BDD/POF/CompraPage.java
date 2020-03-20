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

	public WebElement getBtnNextPage() {
		return btnNextPage;
	}
}
