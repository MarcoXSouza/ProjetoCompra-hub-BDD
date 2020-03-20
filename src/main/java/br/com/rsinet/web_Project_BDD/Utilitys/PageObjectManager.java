package br.com.rsinet.web_Project_BDD.Utilitys;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.web_Project_BDD.POF.CompraPage;
import br.com.rsinet.web_Project_BDD.POF.LoginPage;
import br.com.rsinet.web_Project_BDD.POF.PagamentoPage;

public class PageObjectManager {
	private WebDriver driver;

	private LoginPage loginPage;
	private CompraPage compraPage;
	private AcoesUtils acoes;
	private PagamentoPage pagamentoPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}

	public PagamentoPage getPagamentoPage() {
		return (pagamentoPage == null) ? pagamentoPage = new PagamentoPage(driver) : pagamentoPage;
	}

	public CompraPage getCompraPage() {
		return (compraPage == null) ? compraPage = new CompraPage(driver) : compraPage;
	}

	public AcoesUtils getEsperaPage() {
		return (acoes == null) ? acoes = new AcoesUtils(driver) : acoes;
	}

}
