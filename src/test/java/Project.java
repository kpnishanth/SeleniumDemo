
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
    public static void main(String[] args) throws InterruptedException {
        WebDriver chromeDriver= new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        Thread.sleep(2000);
        chromeDriver.manage().window().maximize();
        chromeDriver.navigate().to("https://www.instagram.com");
        Thread.sleep(2000);
        chromeDriver.navigate().refresh();
        Thread.sleep(2000);
        System.out.println(chromeDriver.getCurrentUrl());
        chromeDriver.close();









    }
}
