package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class Colins_StepDefinitions {
    DialogContent dc=new DialogContent();
    @Given("Colins Web sitesine gidin")
    public void colinsWebSitesineGidin() {
        GWD.getDriver().get("https://www.colins.com.tr/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Colins hesabıyla giriş yapın")
    public void colinsHesabıylaGirişYapın() {
        dc.hoveOver();
        dc.findAndClick("girisYap");
        dc.findAndSend("email","ispanya92@outlook.com");
        dc.findAndSend("password","Husnu3535");
        dc.findAndClick("girisYapButonu");
    }

    @When("Kategorilerden Erkek bölümüne tıklayın")
    public void kategorilerdenErkekBölümüneTıklayın() {
        dc.findAndClick("erkekBölümüTikla");
    }

    @When("Çıkan ekrandan Cinsiyet bölümünden Erkek e tıklayın")
    public void çıkanEkrandanCinsiyetBölümündenErkekETıklayın() {
        dc.findAndClick("cinsiyetTikla");
        dc.findAndClick("erkekTikla");
    }

    @When("Kategori bölümünden Pantolon a tıklayın")
    public void kategoriBölümündenPantolonATıklayın() {
        dc.findAndClick("kategoriTikla");
        dc.findAndClick("pantolonTikla");
    }

    @When("Renk bölümünden Lacivert i seçin")
    public void renkBölümündenLacivertISeçin() {
        dc.findAndClick("renkTikla");
        dc.findAndClick("lacivertTikla");
    }

    @When("Beden bölümünden S yi seçin")
    public void bedenBölümündenSYiSeçin() {
        dc.findAndClick("bedenTikla");
        dc.findAndClick("sTikla");
    }

    @When("Fit bölümünden Normal Kesimi seçin")
    public void fitBölümündenNormalKesimiSeçin() {
        dc.findAndClick("fitTikla");
        dc.findAndClick("normalKesimTikla");
    }

    @When("Paça Tipi bölümünden Düz Paça yı seçin")
    public void paçaTipiBölümündenDüzPaçaYıSeçin() {
        dc.findAndClick("pacaTipiTikla");
        dc.findAndClick("duzPacaTikla");
    }

    @When("Filtreleme bölümündeki tüm seçeneklerin olduğunu doğrulayın")
    public void filtrelemeBölümündekiTümSeçeneklerinOlduğunuDoğrulayın() {
        List<String>expectedRs=new ArrayList<>();
        expectedRs.add("CİNSİYET");
        expectedRs.add("KATEGORI");
        expectedRs.add("RENK");
        expectedRs.add("BEDEN");
        expectedRs.add("FIT");
        expectedRs.add("BEL TIPI");
        expectedRs.add("PAÇA TIPI");
        expectedRs.add("KALIP");
        expectedRs.add("FİYAT");

        List<WebElement>actualRs=GWD.getDriver().findElements(By.xpath("//div[@class='filter-container-mobile-inner']//div[contains(@class,'filter-container filter-container')]"));
        for (int i = 0; i < expectedRs.size() ; i++) {
            Assert.assertEquals(expectedRs.get(i),actualRs.get(i).getText());
        }

    }

    @When("Çıkan Sonuçlardan ilk ürüne tıklayın")
    public void çıkanSonuçlardanIlkÜrüneTıklayın() {
        dc.findAndClick("ilkUrunTikla");
    }

    @When("Sepete Ekleye tıklayın")
    public void sepeteEkleyeTıklayın() {
        dc.findAndClick("sepeteEkle");
    }

    @When("Çıkan Bedenden M ye tıklayın")
    public void çıkanBedendenMYeTıklayın() {
        dc.findAndClick("mTikla");
        dc.verifyText("urunAddVerify","Seçilen ürün sepetinize eklenmiştir");
    }

    @When("Sepete Tıklayın")
    public void sepeteTıklayın() {
        dc.findAndClick("sepeteTikla");
    }

    @When("Ürünün sepete geldiğini doğrulayın")
    public void ürününSepeteGeldiğiniDoğrulayın() {
        dc.verifyText("urunVerify","Orta Bel Normal Kesim Düz Paça Mavi Erkek Pantolon (AÇIK MAVİ)");
    }

    @When("Ürünün sepetten silin")
    public void ürününSepettenSilin() {
        dc.findAndClick("urunSil");
        dc.findAndClick("silTikla");
    }

    @When("Sepette ürünün olmadığını doğrulayın")
    public void sepetteÜrününOlmadığınıDoğrulayın() {
        dc.verifyText("urunYokDogrula","Sepetinizde hiç ürün yoktur");
    }

    @When("Hesabınızdan çıkış yapın")
    public void hesabınızdanÇıkışYapın() {
        dc.hoveOver();
        dc.findAndClick("cikisYap");
    }



}
