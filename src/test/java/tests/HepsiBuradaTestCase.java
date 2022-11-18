package tests;


import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import page.HepsiBuradaPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.openqa.selenium.Keys.ENTER;

public class HepsiBuradaTestCase {

    HepsiBuradaPage hepsiBuradaPage = new HepsiBuradaPage();

    @BeforeMethod
    public static void setUp() {
        Driver.getDriver().get(ConfigurationReader.getProperty("hepsiburada.url"));
    }

    @Test
    public void test() throws InterruptedException {
        hepsiBuradaPage.acceptcookies.click();
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Hepsiburada";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        System.out.println("Ana sayfanın açıldığı onaylandı.");

        hepsiBuradaPage.GirişYap.click();
        BrowserUtils.sleep(2);

        hepsiBuradaPage.login.click();
        BrowserUtils.sleep(5);
        try {
            hepsiBuradaPage.mailPlaceHolder.sendKeys("ahmet_eagle1903@hotmail.com" + ENTER);
        } catch (ElementClickInterceptedException e) {
            e.printStackTrace();
        }
        BrowserUtils.sleep(3);

        hepsiBuradaPage.passwordPlaceHolder.sendKeys("ao131015" + ENTER);
        BrowserUtils.sleep(3);
        System.out.println("Kullanıcı giriş işlemi yapıldı");

        hepsiBuradaPage.searchBox.sendKeys("samsung" + ENTER);
        BrowserUtils.sleep(3);
        System.out.println("Samsung markası arandı");

        hepsiBuradaPage.telefon.click();
        BrowserUtils.sleep(5);

        hepsiBuradaPage.ceptelefonu.click();
        BrowserUtils.sleep(5);
        System.out.println("Telefon ve cep telefonu sekmeleri tıklandı");

        String expectedResult = "samsung";
        String actualResult = hepsiBuradaPage.samsung.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("Samsung için sonuç bulunduğu onaylandı.");
        BrowserUtils.sleep(2);

        hepsiBuradaPage.ürünseçimi.click();
        System.out.println("5.ürün seçildi");

        List<String> sayfalar = new ArrayList<>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(sayfalar.get(1));

        hepsiBuradaPage.beğenButonu.click();
        BrowserUtils.sleep(2);
        System.out.println("Beğen butonuna tıklandı");

        String expected = "liste";
        String actual = hepsiBuradaPage.listepopup.getText();
        Assert.assertTrue(actual.contains(expected));
        BrowserUtils.sleep(2);
        System.out.println("Ürün listeye eklendi popup kontrolü yapıldı");


        hepsiBuradaPage.Hesabım.click();
        BrowserUtils.sleep(2);
        hepsiBuradaPage.beğendiklerim.click();
        BrowserUtils.sleep(2);
        System.out.println("Beğendiklerim butonuna tıklandı");

        String expectedürün = "Samsung";
        String actualÜrün = hepsiBuradaPage.ürünKontrolü.getText();
        Assert.assertTrue(actualÜrün.contains(expectedürün));
        BrowserUtils.sleep(2);
        System.out.println("Beğendiklerimde seçilen ürünün olduğu onaylandı");

        hepsiBuradaPage.sepetiçinürün.click();
        BrowserUtils.sleep(2);
        hepsiBuradaPage.addtoSepet.click();
        BrowserUtils.sleep(2);
        System.out.println("Ürün sepete eklendi");

        String expectedsepet = "sepet";
        String actualsepet = hepsiBuradaPage.sepetpopup.getText();
        Assert.assertTrue(actualsepet.contains(expectedsepet));
        BrowserUtils.sleep(2);
        System.out.println("Ürün sepete eklendi popup kontrolü yapıldı");

        hepsiBuradaPage.sepettenKaldır.click();
        BrowserUtils.sleep(2);
        System.out.println("Ürün sepetten kaldırıldı");

        hepsiBuradaPage.sepetBoş.click();
        BrowserUtils.sleep(2);
        System.out.println("Sepetin boş olduğu onaylandı");


    }


}
