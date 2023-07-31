package TestingAplyiments;

import ObJ.VVapeHomePage;
import org.testng.annotations.Test;

public class VVapeTest extends TestInit{
    @Test
    public void srchTest(){
    goToVVape();
    VVapeHomePage vVapeHomePage = new VVapeHomePage(driver);
    vVapeHomePage.srchBtn().click();
    vVapeHomePage.srchField().click();
    vVapeHomePage.srchField().sendKeys("elfbar BC4000\n");
    vVapeHomePage.btnSearch().click();
    }
    @Test
    public void registrationTest(){
        goToVVape();
        VVapeHomePage vVapeHomePage = new VVapeHomePage(driver);
        vVapeHomePage.regProf().click();
        vVapeHomePage.typePhoneNumber().click();
        vVapeHomePage.typePhoneNumber().sendKeys("0634110269");
    }
    @Test
    public void cartTest(){
        goToVVape();
        VVapeHomePage vVapeHomePage = new VVapeHomePage(driver);
        vVapeHomePage.container().click();
    }
    @Test
    public void doit(){
        System.out.println("Hello World");
    }

}
