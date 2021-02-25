package br.com.felipeholtermann.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

import br.com.felipeholtermann.pages.LoginPage;
import br.com.felipeholtermann.suporte.Web;

public class EfetuarLogin {

	@Test
	public void efetuarLoginComUsuarioValido() throws InterruptedException {
		Web.getInstance().getBrowser().manage().window().maximize();
		Web.getInstance().getBrowser().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new LoginPage().fazerLogin("qatestelogin@outlook.com", "qateste123!").verificaTextoDaPaginaLogada("Terms of Service");
	}
}