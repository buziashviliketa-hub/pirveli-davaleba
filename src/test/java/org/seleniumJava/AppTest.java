package org.seleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Unit test for simple App.
 */
public class AppTest {


    public static void main(String[] args ) {
       /* WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  /* ეს დალოდებაა, ვერ დრაივერი ელოდება რომ ჩაიტვირტოს ის ელემენტი რომელსაც სელექტორით ვეძებთ, 30 წამიდაელოდება მაქს სათითაოდ ყველას*/
   /*     driver.get("http://www.fb.com");
        driver.getCurrentUrl();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));  // ვეითერის ცვლადი შექიქმნა

        WebElement userName = driver.findElement(By.name("email"));
        userName.sendKeys("574999266");

        WebElement password = driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
        password.sendKeys("Xevsuri98");

        WebElement buttonauth = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft']")));  // aq viyeneb zevit sheqmnil ვეითერსდა ვეუბნები რომ როცა ეს ღილაკი დაკლიკებადი იქნება დააკლიკე
        buttonauth.click();

        Wait cvladiwait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30)) // maqs ramden xans daelodos
                .pollingEvery((Duration.ofSeconds(3)))// ramden xanshi ertxel gaushvas motxovna
                .ignoring(NoSuchElementException.class);
       // WebElement mobNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='phone'][name='username']")));
        //mobNumber.sendKeys("574");
        */

                                     //პირველი საშინაო დავალება

PirveliDavaleba sashinaoDavaleba = new PirveliDavaleba();
sashinaoDavaleba.multipTo3();
sashinaoDavaleba.luwiaTuKenti();
sashinaoDavaleba.continue5();
sashinaoDavaleba.countOfVowel();
sashinaoDavaleba.countOfVowel1();
    }

}
