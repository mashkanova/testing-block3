import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Test {
    @FindBy(xpath = "/html/body/search-app//section/section/div/search-filter-dashboard//aside/section[2]/div/search-category-tree//section/ul/li[2]/button/span[1]")
    WebElement menFilter;
    private static String basicURL="https://www.carhartt-wip.com/en";
    @org.testng.annotations.Test
    public void WishListTest() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(basicURL);
        Thread.sleep(3000);
        WebElement search=driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[2]/button[2]"));
        search.click();
        WebElement searchinput = driver.findElement(By.xpath("//input[@class='search-form__input epoq_search_box ui-autocomplete-input']"));
        searchinput.sendKeys("beanies");
        WebElement submitbutton = driver.findElement(By.xpath("//button[@class='search-form__submit epoq_search_button']"));
        submitbutton.click();
    }
}
