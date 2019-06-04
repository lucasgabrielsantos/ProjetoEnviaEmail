package projetopesquisa.projetopesquisa;


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {
	
	static WebDriver driver;
	
	@org.junit.Before
	public void testUsuario() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\lgabriel\\drivers\\chromedriver.exe");
		
		
        //Iniciando o Browser e configurando para maximizar.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        
        //Realizando a pesquisando no navegador.
        driver.get("https://www.google.com");
        
	}
	
	@org.junit.Test
	public void testPesquisa() throws InterruptedException {
		
			//Pesquisando Outlook na web.
		 	driver.findElement(By.name("q")).sendKeys("Outlook");
	        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	        
	        //Realizando login no Outlook.
	        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a[1]")).click();;
	        driver.findElement(By.xpath("/html/body/section/div/div/nav/div/div/div")).click();
	        
	        //Inserindo o login/senha de acesso.
	        driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("lucasgabrielsantos12345@outlook.com");
	        Thread.sleep(1000);
	        driver.findElement(By.id("idSIButton9")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("i0118")).sendKeys("everis123456789*");
	        Thread.sleep(1000);
	        driver.findElement(By.id("idSIButton9")).click();
	        Thread.sleep(4000);
	        
	        //Clicando em nova mensagem.
	        driver.findElement(By.id("id__20")).click();
	        Thread.sleep(1000);
	        
	        //Inserindo o email de destino.
	        driver.findElement(By.xpath("//div/div[@class=\"ms-BasePicker-text pickerText_269bfa71\"]//input[@class=\"ms-BasePicker-input pickerInput_269bfa71\"]")).sendKeys("lucas.gabriel.santos@everis.com");
	        Thread.sleep(1000);
	        
	        //Inserindo assunto do email correspondente.
	        driver.findElement(By.id("subjectLine0")).sendKeys("Teste Everis - Email Automático");
	        Thread.sleep(1000);
	        
	        //Inserindo texto.
	        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[1]/div[3]/div[2]/div/div[3]/div[1]/div/div/div/div[1]/div[2]/div")).sendKeys("SUBIIIIIIIIIIIIIIIIIUUUU");
	        Thread.sleep(1000);
	        
	        //Clicando em enviar.
	        driver.findElement(By.id("id__87")).click();
	        Thread.sleep(3000);
	        
	        //Saindo do navegador.
	        driver.quit();
	       
	        	
	        
	}
		   
}
