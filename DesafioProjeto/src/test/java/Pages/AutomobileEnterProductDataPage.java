package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AutomobileEnterProductDataPage {
    protected WebDriver driver;

    public AutomobileEnterProductDataPage(WebDriver driver) {
		this.driver = driver;
	}

    public void setStardData(String dataFutura){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[1]/input")).sendKeys(dataFutura);
    }
    
    public void setInsuranceSum(String selecaoEscolhida){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select"));
        Select escolha = new Select(element);
        escolha.selectByVisibleText(selecaoEscolhida);
    }
    
    public void setMeritRating(String selecaoEscolhida){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select"));
        Select escolha = new Select(element);
        escolha.selectByVisibleText(selecaoEscolhida);
    }
    
    public void setDamageInsurance(String selecaoEscolha){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/select"));
        Select escolha = new Select(element);
        escolha.selectByVisibleText(selecaoEscolha);
    }
    
    public void setOptionalProducts(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span")).click();
    }
    
    public void setCourtesyCar(String selecionaEscolha){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[6]/select"));
        Select escolha = new Select(element);
        escolha.selectByVisibleText(selecionaEscolha);
    }
    
    public void setNextPageEnterProductData(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[7]/button[2]")).click();
    }
    
    public void setPrevPageAnterior(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[7]/button[1]")).click();
    }
    public void preencherFormularioProductData(){
        setStardData("11/30/2022");
        setInsuranceSum("5.000.000,00");
        setMeritRating("Bonus 1");
        setDamageInsurance("No Coverage");
        //seta Euro
        setOptionalProducts();
        setCourtesyCar("Yes");
        setNextPageEnterProductData();
    }
}
