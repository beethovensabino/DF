package Pages;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomobileSendQuotePage {

    WebDriver driver;

    public AutomobileSendQuotePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
	}
	
    public void setEmail(String email){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[1]/input")).sendKeys(email);
    }
    
    public void setPhone(String phone){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[2]/input")).sendKeys(phone);
    }
    
    public void setUserName(String userName){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[3]/input")).sendKeys(userName);
    }
    
    public void setPassword(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[4]/input")).sendKeys("Jose123");
    }
    
    public void setConfirmaSenha(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[5]/input")).sendKeys("Jose123");
        //Assert com comparação de senha
    }
    
    public void setComentario(String comentario){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[6]/textarea")).sendKeys(comentario);
    }
    
    public void setNextPageSend(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[2]")).click();
    }
    
    public void setPrevPage(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[7]/button[1]")).click();
    }
    
    public void setValidaMensagem(){
        String textoMensagem = driver.findElement(By.xpath("/html/body/div[4]/h2")).getText();
        Assert.assertEquals("Sending e-mail success" , textoMensagem);
        driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
    }
    public void preencherFormSendQuotePage(){
        setEmail("teste@gmail.com");
        setPhone("83955555555");
        setUserName("User10");
        //SetadoDiretamente
        setPassword();
        setConfirmaSenha();
        setComentario("comntario teste");
        //Confirmacao
        setNextPageSend();




    }
}
