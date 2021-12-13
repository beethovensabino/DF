package Pages;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AutomobileEnterInsurantDataPage{

    protected WebDriver driver;

    public AutomobileEnterInsurantDataPage(WebDriver driver) {
    	this.driver = driver; 
    	PageFactory.initElements(driver, this);
	}

	

    @Test
    public void setTelaAtual(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[2]/a")).click();
    }
    @Test
    public void setFirsName() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[1]/input")).sendKeys("Meu Nome");
    }
    @Test
    public void setLastName(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input")).sendKeys("Firma");
    }
    @Test
    public void setDataNascimento(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[3]/input")).sendKeys("05/30/1996");
    }
    @Test
    public void setGender(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span")).click();
    }
    @Test
    public void setStreetAddress(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[5]/input")).sendKeys("05/30/1996");
    }
    @Test
    public void setCountry(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select"));
        Select escolha = new Select(element);
        escolha.selectByVisibleText("Argentina");
    }
    @Test
    public void setZipCode(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input")).sendKeys("1234");
    }
    @Test
    public void setCity(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input")).sendKeys("Pedra Brsnca");
    }
    @Test
    public void setOccupation(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select"));
        Select escolha = new Select(element);
        escolha.selectByVisibleText("farmer");
    }
    @Test
    public void setHoobies(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span")).click();
    }
    @Test
    public void setWebsite(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span")).sendKeys("www.google.com");
    }
    //@Test
    //public void setpicture(){
    //    driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[12]/div/input")).sendKeys(src/test/resources/imagemteste.jpeg);
    //    img = driver.findElement(By.xpath(://idea/navigate/reference?project=DesafioProjeto&path=src/test/resources/imagemteste.jpeg));
    //}
    @Test
    public void clickNextProximaPagina(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[13]/button[2]")).click();
    }
    @Test
    public void preencherFormularioEnterInsurantData(){
        setFirsName();
        setLastName();
        setDataNascimento();
        //clicaMale
        setGender();
        setStreetAddress();
        setCountry();
        setZipCode();
        setCity();
        setOccupation();
        //seleciona um dos Hoobies
        setHoobies();

        setWebsite();
        //setpicture();
        clickNextProximaPagina();
    }
}
