package Pages;

import Utilities.GWD;
import freemarker.cache.WebappTemplateLoader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.tracing.EventAttributeValue;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "img[alt='user-icon']")
    private WebElement girisIcon;

    @FindBy(css = "a[class='login-button']")
    private WebElement girisYap;

    @FindBy(css = "input[name='LoginModel.Email']")
    private WebElement email;

    @FindBy(css = "input[name='LoginModel.Password']")
    private WebElement password;

    @FindBy(css = "input[value='GİRİŞ YAP']")
    private WebElement girisYapButonu;

    @FindBy(xpath = "(//ul[@class='m-0 p-0']//li)[58]//a[@class='  newfont']")
    private WebElement erkekBölümüTikla;

    @FindBy(xpath = "//span[text()='CİNSİYET']")
    private WebElement cinsiyetTikla;

    @FindBy(xpath = "(//*[text()='Erkek'])[3]")
    private WebElement erkekTikla;

    @FindBy(xpath = "//span[text()='Kategori']")
    private WebElement kategoriTikla;

    @FindBy(xpath = "//label[text()='Pantolon']")
    private WebElement pantolonTikla;

    @FindBy(xpath = "//span[text()='Renk']")
    private WebElement renkTikla;

    @FindBy(xpath = "//label[text()='Lacivert']")
    private WebElement lacivertTikla;

    @FindBy(xpath = "//span[text()='Beden']")
    private WebElement bedenTikla;

    @FindBy(xpath = "//label[text()='S']")
    private WebElement sTikla;

    @FindBy(xpath = "//span[text()='Fit']")
    private WebElement fitTikla;

    @FindBy(xpath = "//label[@for='17429']")
    private WebElement normalKesimTikla;

    @FindBy(xpath = "//span[text()='Paça Tipi']")
    private WebElement pacaTipiTikla;

    @FindBy(xpath = "//label[@for='17430']")
    private WebElement duzPacaTikla;

    @FindBy(css = "img[src='https://img-colinstr.mncdn.com/mnresize/800/-/Assets/Branch/Originals/155342_0.jpeg']")
    private WebElement ilkUrunTikla;

    @FindBy(xpath = "//span[text()='Ürün Kodu: CL1057982_Q1.V1_LNV']")
    private WebElement urunKoduDogrula;

    @FindBy(xpath = "//a[@id='addtocartbutton']")
    private WebElement sepeteEkle;

    @FindBy(xpath = "//div[text()='M']")
    private WebElement mTikla;

    @FindBy(xpath = "//div[text()='Seçilen ürün sepetinize eklenmiştir.']")
    private WebElement urunAddVerify;

    @FindBy(css = "a[class='basketLink position-relative']>img")
    private WebElement sepeteTikla;

    @FindBy(xpath = "(//a[@href='/p/orta-bel-normal-kesim-duz-paca-mavi-erkek-pantolon-35512'])[5]")
    private WebElement urunVerify;

    @FindBy(xpath = "//span[text()='Sil']")
    private WebElement urunSil;

    @FindBy(xpath = "//button[@id='btnYes']")
    private WebElement silTikla;

    @FindBy(xpath = "//div[@class='alert']")
    private WebElement urunYokDogrula;

    @FindBy(xpath = "//a[text()='ÇIKIŞ']")
    private WebElement cikisYap;













    WebElement myElement;

    public void findAndClick(String element){
        switch (element){
            case "girisYap":myElement=girisYap;break;
            case "girisYapButonu":myElement=girisYapButonu;break;
            case "erkekBölümüTikla":myElement=erkekBölümüTikla;break;
            case "cinsiyetTikla":myElement=cinsiyetTikla;break;
            case "erkekTikla":myElement=erkekTikla;break;
            case "kategoriTikla":myElement=kategoriTikla;break;
            case "pantolonTikla":myElement=pantolonTikla;break;
            case "renkTikla":myElement=renkTikla;break;
            case "lacivertTikla":myElement=lacivertTikla;break;
            case "bedenTikla":myElement=bedenTikla;break;
            case "sTikla":myElement=sTikla;break;
            case "fitTikla":myElement=fitTikla;break;
            case "normalKesimTikla":myElement=normalKesimTikla;break;
            case "pacaTipiTikla":myElement=pacaTipiTikla;break;
            case "duzPacaTikla":myElement=duzPacaTikla;break;
            case "ilkUrunTikla":myElement=ilkUrunTikla;break;
            case "sepeteEkle":myElement=sepeteEkle;break;
            case "mTikla":myElement=mTikla;break;
            case "sepeteTikla":myElement=sepeteTikla;break;
            case "urunSil":myElement=urunSil;break;
            case "silTikla":myElement=silTikla;break;
            case "cikisYap":myElement=cikisYap;break;





        }
        clickFunction(myElement);
    }

    public void findAndSend(String element,String value){
        switch (element){
            case "email":myElement=email;break;
            case "password":myElement=password;break;



        }
        sendKeysFunction(myElement,value);
    }

    public void verifyText(String element,String text){
        switch (element){
            case "urunKoduDogrula":myElement=urunKoduDogrula;break;
            case "urunAddVerify":myElement=urunAddVerify;break;
            case "urunVerify":myElement=urunVerify;break;
            case "urunYokDogrula":myElement=urunYokDogrula;break;



        }
        verifyContainsText(myElement,text);
    }


    public void hoveOver(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(girisIcon).build().perform();
    }









}
