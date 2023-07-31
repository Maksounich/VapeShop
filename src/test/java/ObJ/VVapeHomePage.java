package ObJ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VVapeHomePage extends BasicPage{

    public VVapeHomePage(WebDriver driver){
        super(driver);
    }
    public WebElement btnSearch(){
        return driver.findElement(By.xpath("//input[contains (@id, 'button-search')]"));
    }
    public WebElement srchField(){
        return driver.findElement(By.xpath("//input[contains (@name, 'search')]"));

    }


    public WebElement container(){
        return driver.findElement(By.xpath("//div[contains (@id, 'cart-url')]/div[contains (@class, 'all-icon cart-icon')]"));
    }
    public WebElement typePhoneNumber(){
        return driver.findElement(By.xpath("//input[contains (@name, 'phone')]"));
    }
    public WebElement regProf(){
        return driver.findElement(By.xpath("//div[contains (@id, 'smsreg')]"));
    }

    public WebElement srchBtn(){
        return driver.findElement(By.xpath("//div[contains (@class, 'panel-url ib')]/div[contains (@class, 'all-icon search-icon')]"));
    }


}
