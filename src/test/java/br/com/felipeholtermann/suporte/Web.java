package br.com.felipeholtermann.suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

	private static Web instance;
	private WebDriver browser;

	public static WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\TesteLogin\\chromedriver.exe");

		// Abrindo o navegador - cria a instnância do Chrome
		WebDriver navegador = new ChromeDriver();

		// Navegando para a página de teste
		navegador.get("https://id.heroku.com/login");

		return navegador;
	}

	private Web() {
		browser = createChrome();
	}

	public static synchronized Web getInstance() {
		if (instance == null) {
			instance = new Web();
		}

		return instance;
	}

	public WebDriver getBrowser() {
		return browser;
	}

}