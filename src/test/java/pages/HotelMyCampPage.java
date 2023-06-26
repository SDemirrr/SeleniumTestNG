package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "//*[@*='details-button']")
   public WebElement guvenlik1;

    @FindBy(xpath = "//*[@*='proceed-link']")
    public WebElement guvenlik2;

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;

    @FindBy(xpath = "(//*[@*='UserName'])[1]")
    public WebElement userName;

    @FindBy(xpath = "(//*[@*='Password'])[1]")
    public WebElement password;

    @FindBy(xpath = "//*[@*='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement girisYapilamadi;

    @FindBy(xpath = "//*[@*='menuHotels']")
    public WebElement hotelMenagement;

    @FindBy(xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRooomResarvation;

    @FindBy(xpath = "(//*[@href='/admin/RoomReservationAdmin'])[1]")
    public WebElement roomResarvation;

    @FindBy(xpath = "(//*[@*='IDUser'])[1]")
    public WebElement idUser;
    @FindBy(xpath = "(//*[@*='IsPaid'])[1]")
    public WebElement isPaid;
 @FindBy(xpath = "//*[text()='RoomReservation was inserted successfully']")
 public WebElement roomReservationText;

 @FindBy(xpath = "//*[@*='btn btn-primary']")
 public WebElement okButton;
}
