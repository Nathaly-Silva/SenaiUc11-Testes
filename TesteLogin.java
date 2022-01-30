package br.senai.sp.testegamemania;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteLogin {
	private WebDriver driver;
	
	//utilizar o Chrome
	@Before
	public void Setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	
	@Test	
	public void TestarLogin() {
		driver.get("http://localhost:4200/");
		driver.findElement(By.xpath("//*[@id=\"menu\"]/a[4]")).click();
		
		// Primeiro Teste
		//driver.findElement(By.id("email")).sendKeys("nathaly@email.com");
		//driver.findElement(By.id("senha")).sendKeys("batatinha");
		//
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("/html/body/app-root/app-login/div/main/form/button")).click();
		
		//WebElement mensagem = driver.findElement(By.id("mensagem"));
		//System.out.println(mensagem.getText());//
	//}
//}
		
		//Teste 3 tentativas
		//WebElement inputEmail = driver.findElement(By.id("email"));
		//WebElement inputSenha = driver.findElement(By.id("senha"));
		//WebElement botao = driver.findElement(By.xpath("/html/body/app-root/app-login/div/main/form/button"));
		
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		//for(int tentativas = 0; tentativas < 3; tentativas++) {
		//	try {
			//	inputEmail.clear();
			//	inputSenha.clear();
				
			//	inputEmail.sendKeys("nathaly@email.com");
			//	inputSenha.sendKeys("gfshgfydsugf");
			//	botao.click();
				
			//	Thread.sleep(3000);
			//} catch (InterruptedException e) {
		//		// TODO Auto-generated catch block
		//		e.printStackTrace();
			//}
		//}
			
		//	WebElement mensagem = driver.findElement(By.id("mensagem"));
		//	System.out.println(mensagem.getText());
			
			
			//teste 3 tentativas, 2 erradas e 1 certa
			WebElement inputEmail = driver.findElement(By.id("email"));
			WebElement inputSenha = driver.findElement(By.id("senha"));
			WebElement botao = driver.findElement(By.xpath("/html/body/app-root/app-login/div/main/form/button"));
			
			String[] listaSenhas = {"peixefrito", "cebolinha", "batatinha"};
			
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			
			for(int tentativas = 0; tentativas < 3; tentativas++) {
				try {
					inputEmail.clear();
					inputSenha.clear();
					
					inputEmail.sendKeys("nathaly@email.com");
					inputSenha.sendKeys(listaSenhas[tentativas]);
					botao.click();
					
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}	
				WebElement mensagem = driver.findElement(By.id("mensagem"));
				System.out.println(mensagem.getText());			
	}
}
		
	
			
		
		
	
	

