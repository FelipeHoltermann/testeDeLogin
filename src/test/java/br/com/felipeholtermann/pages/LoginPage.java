package br.com.felipeholtermann.pages;

import org.openqa.selenium.By;

import br.com.felipeholtermann.suporte.NavegadorBase;

// Operações referentes ao login da página de teste

public class LoginPage extends NavegadorBase {

	public void digitarLogin(String login) {
		navegador.findElement(By.id("email")).sendKeys(login);
	}

	public void digitarSenha(String senha) {
		navegador.findElement(By.id("password")).sendKeys(senha);

	}

	public LogedPage clicarNoBotaoLogin() throws InterruptedException {
		navegador.findElement(By.xpath("//*[@id=\"login\"]/form/button")).click();
		Thread.sleep(500);
		return new LogedPage();
	}

	public LogedPage fazerLogin(String login, String senha) throws InterruptedException {
		digitarLogin(login);
		digitarSenha(senha);
		clicarNoBotaoLogin();

		return new LogedPage();
	}

}
