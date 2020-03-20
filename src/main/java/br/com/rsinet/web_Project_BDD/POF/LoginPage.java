package br.com.rsinet.web_Project_BDD.POF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.web_Project_BDD.Utilitys.ExcelUtils;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menuUser")
	private WebElement linkLogin;

	@FindBy(name = "username")
	private WebElement nomeUsuario;

	@FindBy(name = "password")
	private WebElement senha;

	@FindBy(id = "sign_in_btnundefined")
	private WebElement singIn;

	@FindBy(xpath = "//span[@class='hi-user containMiniTitle ng-binding']")
	private WebElement usuarioLogado;

	public void getLinkLogin() {
		linkLogin.click();
	}

	public void getNomeUsuario() {
		nomeUsuario.click();
		nomeUsuario.sendKeys(ExcelUtils.getCellData(2, 0));
	}

	public void getSenha() {
		senha.click();
		senha.sendKeys(ExcelUtils.getCellData(2, 1));
	}

	public WebElement getSingIn(){
		return singIn;
	}
	
	public String getUsuarioLogado() {
		return usuarioLogado.getText();
		
	}
	
}