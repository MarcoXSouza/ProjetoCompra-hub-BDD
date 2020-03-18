package br.com.rsinet.web_Project_BDD.TestSteps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.web_Project_BDD.POF.CompraPage;
import br.com.rsinet.web_Project_BDD.POF.LoginPage;
import br.com.rsinet.web_Project_BDD.Utilitys.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CompraSteps {
	private WebDriver driver;
	private WebDriverWait wait;
	private TestContext testContext;
	private CompraPage compra;
	private LoginPage login;

	public CompraSteps(TestContext context) {
		testContext = context;
		compra = testContext.getPageObjectFactory().getCompraPage();
		login = testContext.getPageObjectFactory().getLoginPage();
		driver = testContext.getDriverFactory().iniciaNavegador();
		wait = new WebDriverWait(driver, 50);
	}

	@Dado("^que estou logado no advantagedemo$")
	public void que_estou_logado_no_advantagedemo() throws InterruptedException {
		login.getLinkLogin();
		login.getNomeUsuario();
		login.getSenha();
		wait.until(ExpectedConditions.elementToBeClickable(login.getSingIn())).click();
//		Assert.assertTrue(login.getUsuarioLogado().contains("porcaria"));
	}

	@Quando("^eu escolher um topico$")
	public void eu_escolher_um_topico() throws InterruptedException {
		Thread.sleep(2000);
		compra.getItem();

	}

	@Quando("^clicar em um produto$")
	public void clicar_em_um_produto() {
		compra.getProdutoEscolhido();

	}

	@Entao("^efetuar a compra$")
	public void efetuar_a_compra() throws InterruptedException {
		compra.getAdcAoCarrinho();
		compra.getChkOutPopUp();
		wait.until(ExpectedConditions.elementToBeClickable(compra.getBtnNextPage())).click();;
//		compra.getBtnNextPage();
		compra.getUsuarioSafePay();
		compra.getSenhaSafePay();
		compra.getSalvarDados();
		compra.getPagar();

	}

	@Entao("^nao efetuar a compra$")
	public void nao_efetuar_a_compra() {

	}

}
