package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AutomobileEnterVehicleDataPage {

    protected WebDriver driver;
    AutomobileEnterInsurantDataPage page2;
    public AutomobileEnterVehicleDataPage(WebDriver driver) {
    	this.driver = driver;

	}

    public void selectMake() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select"));
        Select combo = new Select(element);
        combo.selectByVisibleText("Audi");
    }

    public void setModel() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/select"));
        Select combo = new Select(element);
        combo.selectByVisibleText("Scooter");
    }

    public void setCylinderCapacity() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[3]/input")).sendKeys("10");
    }

    public void setEnginePerformace() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[4]/input")).sendKeys("11");
    }

    public void setDatamanufatura(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[5]/input")).sendKeys("11/30/2021");
    }
    
    public void setNumberOfSeats() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/select"));
        Select escolha = new Select(element);
        escolha.selectByVisibleText("2");
    }

    public void setRightHandDriver() {
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p/label[1]/span")).click();
    }
    
    public void setNumberOfSeats2() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/select"));
        Select escolha1 = new Select(element);
        escolha1.selectByVisibleText("1");
    }
    
    public void setFuelType(){
        WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/select"));
        Select escolha2 = new Select(element);
        escolha2.selectByVisibleText("Diesel");
    }
    
    public void setPayload(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[10]/input")).sendKeys("55");
    }
    
    public void setTotalWeighteight(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[11]/input")).sendKeys("1000");
    }
    
    public void setListPrince(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[12]/input")).sendKeys("1000");
    }
    
    public void setLicensePlateNumber(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[13]/input")).sendKeys("007");
    }
    
    public void setAnualMileage(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[14]/input")).sendKeys("1000");
    }
    
    public void setProxPageNextEnterInsurantData(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[15]/button")).click();
    }

    public void preencherFormularioEnterVehicleData(){
        selectMake();
        setModel();
        setCylinderCapacity();
        setEnginePerformace();
        setDatamanufatura();
        setNumberOfSeats();
        //Seta Yes
        setRightHandDriver();
        setNumberOfSeats2();
        setFuelType();
        setPayload();
        setTotalWeighteight();
        setListPrince();
        setLicensePlateNumber();
        setAnualMileage();
        setProxPageNextEnterInsurantData();
    }

}
