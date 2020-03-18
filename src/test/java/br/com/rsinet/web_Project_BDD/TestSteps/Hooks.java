package br.com.rsinet.web_Project_BDD.TestSteps;

import br.com.rsinet.web_Project_BDD.Utilitys.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	private TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void abreBrowser() {
		testContext.getDriverFactory().iniciaNavegador();
	}

	@After
	public void fechaBrowser() {
		testContext.getDriverFactory().fechaDriver();
	}

}
