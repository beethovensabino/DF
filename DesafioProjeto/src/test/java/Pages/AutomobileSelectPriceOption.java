package Pages;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class AutomobileSelectPriceOption {

    WebDriver driver;

    public AutomobileSelectPriceOption(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
	}


   
    public void setSelectOptionSilver(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span")).click();
    }
    
    public void setSelectOptionGold(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span")).click();
    }
    
    public void setSelectOptionPlatinum(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[3]/span")).click();
    }
    
    public void setSelectOptionSUltimation(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span")).click();
    }
    
    public void setNextPageSelectPriceOption(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]")).click();
    }
    
    public void setPrevPageSelectPriceOption(){
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[1]")).click();
    }
    public void preencherFormSelectPriceOption(){
        setSelectOptionSilver();
        setNextPageSelectPriceOption();
    }

}
