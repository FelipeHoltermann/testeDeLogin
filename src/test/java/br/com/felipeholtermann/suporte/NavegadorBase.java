package br.com.felipeholtermann.suporte;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class NavegadorBase {
	protected static WebDriver navegador;

	public NavegadorBase() {
		NavegadorBase.navegador = Web.getInstance().getBrowser();
		NavegadorBase.navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}