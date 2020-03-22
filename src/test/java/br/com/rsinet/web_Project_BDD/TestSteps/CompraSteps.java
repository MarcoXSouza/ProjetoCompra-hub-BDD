package br.com.rsinet.web_Project_BDD.TestSteps;

import org.junit.Assert;

import br.com.rsinet.web_Project_BDD.POF.CompraPage;
import br.com.rsinet.web_Project_BDD.POF.LoginPage;
import br.com.rsinet.web_Project_BDD.POF.PagamentoPage;
import br.com.rsinet.web_Project_BDD.Utilitys.AcoesUtils;
import br.com.rsinet.web_Project_BDD.Utilitys.Constantes;
import br.com.rsinet.web_Project_BDD.Utilitys.ExcelUtils;
import br.com.rsinet.web_Project_BDD.Utilitys.TestContext;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CompraSteps {
	private TestContext testContext;
	private CompraPage compra;
	private LoginPage login;
	private AcoesUtils acoes;
	private PagamentoPage pagamento;

	public CompraSteps(TestContext context) throws Exception {
		testContext = context;
		compra = testContext.getPageObjectFactory().getCompraPage();
		login = testContext.getPageObjectFactory().getLoginPage();
		acoes = testContext.getPageObjectFactory().getEsperaPage();
		pagamento = testContext.getPageObjectFactory().getPagamentoPage();
		ExcelUtils.setExcelFile(Constantes.file, "CompraBDD");
	}

	@Dado("^que estou logado no advantagedemo$")
	public void que_estou_logado_no_advantagedemo() throws InterruptedException {
		login.getLinkLogin();
		login.getNomeUsuario();
		login.getSenha();
		acoes.esperaAte(login.getSingIn());
		Assert.assertTrue(login.getUsuarioLogado().contains(ExcelUtils.getCellData(2, 0)));
	}

	@Quando("^eu escolher um topico$")
	public void eu_escolher_um_topico() throws InterruptedException {
		compra.getItem();

	}

	@Quando("^clicar em um produto$")
	public void clicar_em_um_produto() {
		compra.getProdutoEscolhido();
		compra.getAdcAoCarrinho();
		compra.getChkOutPopUp();
		acoes.clicaNext(compra.getBtnNextPage());
	}

	@Entao("^efetuar a compra$")
	public void efetuar_a_compra() throws InterruptedException {
		pagamento.getUsuarioSafePay();
		pagamento.getSenhaSafePay();
		pagamento.getPagar();

	}

	@Entao("^nao efetuar a compra$")
	public void nao_efetuar_a_compra() {
		pagamento.getUsuarioSafePay();
		pagamento.getSenhaSafePayInvalida();
		pagamento.getSalvarDados();
		Assert.assertTrue(pagamento.getMsgSenhaInvalida().equals("Use maximum 12 character"));
	}

}
