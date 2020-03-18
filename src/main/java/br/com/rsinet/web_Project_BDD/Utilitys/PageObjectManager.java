package br.com.rsinet.web_Project_BDD.Utilitys;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.web_Project_BDD.POF.CompraPage;
import br.com.rsinet.web_Project_BDD.POF.LoginPage;

public class PageObjectManager {
	private WebDriver driver;

	private LoginPage loginPage;
	private CompraPage compraPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}

	public CompraPage getCompraPage() {
		return (compraPage == null) ? compraPage = new CompraPage(driver) : compraPage;
	}

}
