package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private static final String HOMEPAGE_URL = "https://www.carhartt-wip.com/en";
    private final WebDriver driver;

    public static boolean isSearched = false;

    @FindBy(xpath = "//button[@title='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//input[@class='search-form__input epoq_search_box ui-autocomplete-input']")
    private WebElement searchInput;
    @FindBy(xpath = "//button[@class='search-form__submit epoq_search_button']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@class='product-grid-item-container small']")
    private WebElement accessoryButton;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MainPage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }

    public void enterSearchText(String searchText) {
        searchInput.sendKeys(searchText);
        submitButton.click();

    }

    public void enterAccessory() {
        accessoryButton.click();
        isSearched = true;
    }

    public void searchClick() {
        searchButton.click();
    }
}
