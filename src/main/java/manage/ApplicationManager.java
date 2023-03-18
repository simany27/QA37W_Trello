package manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationManager {
    WebDriver wd;
    UserHelper user;

    public void init(){
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com");
        wd.manage().window().maximize();
        user = new UserHelper(wd);
    }

    public UserHelper getUser() {
        return user;
    }

    public void quit(){
        wd.close();
        wd.quit();
    }
}
