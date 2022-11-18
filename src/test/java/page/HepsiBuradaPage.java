package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;
import utilities.Driver;

public class HepsiBuradaPage extends TestBase {

    public HepsiBuradaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[text()='Kabul Et']")
    public WebElement acceptcookies;

    @FindBy(xpath = "//span[@title='Giriş Yap']")
    public WebElement GirişYap;

    @FindBy(id = "login")
    public WebElement login;

    @FindBy(id = "txtUserName")
    public WebElement mailPlaceHolder;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;

    @FindBy(name = "password")
    public WebElement passwordPlaceHolder;

    @FindBy(id = "btnEmailSelect")
    public WebElement emailloginButton;

    @FindBy(xpath = "(//input[@class='desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b'])")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='treeCategoryContent-XPVj5InCxOWIJtyTC35Z'])[1]")
    public WebElement telefon;

    @FindBy(xpath = "(//div[@class='treeCategoryContent-XPVj5InCxOWIJtyTC35Z'])[1]")
    public WebElement ceptelefonu;

    @FindBy(xpath = "(//div[@class='searchResultSummaryBar-HM2Hk6FnQ2zwnblc0BJb'])")
    public WebElement samsung;

    @FindBy(xpath = "//li[@id='i4']")
    public WebElement ürünseçimi;

    @FindBy(xpath = "//div[@class='customerAccount-Like-13gj2']")
    public WebElement beğenButonu;

    @FindBy(xpath = "//div[@class='hb-toast-notifier-container hb-toast-notifier-position-top-right']")
    public WebElement listepopup;

    @FindBy(xpath = "//span[@class='sf-OldMyAccount-sS_G2sunmDtZl9Tld5PR']")
    public WebElement Hesabım;

    @FindBy(xpath = "//a[@title='Beğendiklerim']")
    public WebElement beğendiklerim;

    @FindBy(xpath = "//h3[@class='hb-fzokND eVNKao sbljevwe5aw']")
    public WebElement ürünKontrolü;

    @FindBy(xpath = "//div[@class='hb-fzpaiS gATT sup6sj0m3ug']")
    public WebElement sepetiçinürün;

    @FindBy(xpath = "//button[@class='button big with-icon']")
    public WebElement addtoSepet;

    @FindBy(xpath = "//div[@class='checkoutui-ProductOnBasketHeader-iw50qYCZPlh2SmNOYu1E']")
    public WebElement sepetpopup;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement sepetimegit;

    @FindBy(xpath = "//a[@class='product_delete_1zR-0']")
    public WebElement sepettenKaldır;

    @FindBy(xpath = "//h1[.='Sepetin şu an boş']")
    public WebElement sepetBoş;


}
