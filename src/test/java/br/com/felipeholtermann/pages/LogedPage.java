package br.com.felipeholtermann.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.felipeholtermann.suporte.NavegadorBase;

public class LogedPage extends NavegadorBase{
	private WebElement validaPagina;
	
	public LogedPage() {
		this.validaPagina = navegador.findElement(By.xpath("//*[@id=\"ember9\"]"));
	}

	public WebElement getValidaPagina() {
		return validaPagina;
	}
	
	public void verificaTextoDaPaginaLogada(String textoPagina) {
		assertEquals(textoPagina, getValidaPagina().getText().trim());
	}

}
