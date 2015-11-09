package com.selenium.junit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ByChained;

//import static org.hamcrest.Matchers.endsWith;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.Matchers.startsWith;

import static org.hamcrest.Matchers.*;

/**
 * Created by David on 27/04/2015.
 */
public class DriverTest {

    private static WebDriver driver;
    private static final String s = "http://www.compendiumdev.co.uk/selenium/find_by_playground.php";



@BeforeClass
public static void createDriver(){

 // String filepath = "C:\\Users\\David\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\2.45.0\\selenium-chrome-driver-2.45.0.jar";

  // System.setProperty("webdriver.chrome.driver",filepath);

    driver = new FirefoxDriver();


}



    @Test
    public void navigatewithNavigate(){

        driver.navigate().to("http://www.conxjobs.com");
        Assert.assertTrue(driver.getTitle().startsWith("Find Construction Jobs"));
    }


    @Test

    public void navigateForwardtest() {

        //String string = driver.getTitle();


        driver.navigate().to("http://www.conxjobs.com");
        driver.navigate().to("http://www.conxjobs.com/about");
        Assert.assertTrue(driver.getTitle().startsWith("Find Construction Jobs"));
        driver.navigate().back();
        Assert.assertTrue(driver.getTitle().startsWith("Find Construction Jobs"));
        driver.navigate().forward();
        Assert.assertTrue(driver.getTitle().endsWith("ConX Construction Jobs"));
    }

   @Test

   public void pageSourceTest(){
    String s = driver.getPageSource();

       final String url = "http://www.conxjobs.com";
       driver.navigate().to("http://www.conxjobs.com");
       driver.getPageSource();
       boolean b = driver.getPageSource().contains("ConX logo");
       Assert.assertTrue(b);
       System.out.print(s);
      // Assert.assertTrue(driver.getPageSource().contains("ConX was built by tradies"));

   }

    @Test
    public void getCurrentURLTest(){

        String s = "https://www.conxjobs.com/";

        driver.navigate().to(s);
       Assert.assertEquals(driver.getCurrentUrl(), s);
        System.out.print(s);
    }


@Test

    public void firstInterrogationTest(){

        String s = "http://www.compendiumdev.co.uk/selenium/basic_web_page.html";

        driver.navigate().to(s);

        WebElement firstelement = driver.findElement(By.id("para2"));
        Assert.assertEquals(firstelement.getText(),"Another paragraph of text");
    }


    @Test

    public void secondInterrogationTest(){

        String s = "http://www.conxjobs.com/about";

        driver.navigate().to(s);

        WebElement element = driver.findElement(By.id("orange-header"));
        Assert.assertEquals(element.getText(),"A piece of smart technology bringing contractors and tradies together for work");
    }

    @Test

    public void thirdInterrogationTest(){

        String s = "http://www.compendiumdev.co.uk/selenium/find_by_playground.php";


        driver.navigate().to(s);
        WebElement element = driver.findElement(By.id("a26"));
        Assert.assertEquals(element.getText(),"jump to para 0");
    }

    @Test
    public void fourthInterrogationTest(){

        String s = "http://www.compendiumdev.co.uk/selenium/find_by_playground.php";
        driver.navigate().to(s);
        WebElement element = driver.findElement(By.linkText("jump to para 1"));
        Assert.assertEquals(element.getAttribute("name"),"aName27");
    }


    @Test
    public void fifthInterrogationTest(){

        String s = "http://www.compendiumdev.co.uk/selenium/find_by_playground.php";
        driver.navigate().to(s);
        WebElement element = driver.findElement(By.linkText("jump to para 1"));
        String href = element.getAttribute("href");
        Assert.assertTrue(href.endsWith("#pName1"));
    }


    @Test
    public void sixthInterrogationTest(){

        String s = "http://www.compendiumdev.co.uk/selenium/find_by_playground.php";
        driver.navigate().to(s);
        WebElement element = driver.findElement(By.name("aName27"));
        String href = element.getAttribute("class");
        Assert.assertTrue(href.equals("normal"));
    }

    @Test
    public void seventhInterrogationTest(){

        String s = "http://www.compendiumdev.co.uk/selenium/find_by_playground.php";
        driver.navigate().to(s);
        WebElement element = driver.findElement(By.partialLinkText("para 1"));
        String href = element.getAttribute("id");
        Assert.assertTrue(href.equals("a27"));
    }

@Test

public void ListofElementsTest() {

    String s = "http://www.compendiumdev.co.uk/selenium/find_by_playground.php";
    driver.navigate().to(s);
    List<WebElement> elements;
    elements = driver.findElements(By.className("normal"));

    Set<String> tags = new HashSet<String>();

    for (WebElement e : elements) {
        tags.add(e.getTagName());
    }

    Assert.assertTrue("Expected p tag", tags.contains("p"));

}
    @Test

    public void assertDivTest(){

        String s = "http://www.compendiumdev.co.uk/selenium/find_by_playground.php";
        driver.navigate().to(s);
        List<WebElement> elements;
        elements = driver.findElements(By.tagName("div"));
        Set<String> divList = new HashSet<String>();

        //for (WebElement e : elements) {
          //  divList.add(e.getAttribute("id"));

        //}
        Assert.assertEquals("Asserting there is 19 div tags",19,elements.size());
        //Assert.assertTrue();


    }

    @Test

    public void hrefTest(){

        String s = "http://www.compendiumdev.co.uk/selenium/find_by_playground.php";
        driver.navigate().to(s);
        List<WebElement> elements;
        elements = driver.findElements(By.partialLinkText("jump to para"));

        Assert.assertEquals("Asserting there are 25 links",25,elements.size());
    }


    @Test

    public void nestedTest() {

        String s = "http://www.compendiumdev.co.uk/selenium/find_by_playground.php";
        driver.navigate().to(s);
        List<WebElement> elements;
        elements = driver.findElements(By.name("nestedDiv"));
        Set<String> divlist = new HashSet<String>();

        for (WebElement e : elements) {
            divlist.add(e.getAttribute("id"));
        }

        Assert.assertEquals("Asserting there are 16 nested divs",16,elements.size());
    }

    @Test
    public void paraTest(){

        driver.navigate().to(s);
        List<WebElement> elements;
        elements = driver.findElements((By.tagName("p")));
        Assert.assertEquals(" Asserting there are 41 paragraphs",41,elements.size());
    }



    @Test

    public void ByChainedTest(){

        driver.navigate().to(s);

        WebElement element = driver.findElement(new ByChained
                (By.id("p12"),
                By.name("pName12")
               // By.tagName("blah")
        ));

        Assert.assertEquals("testing how robust the ByChained method is","a12",element.getAttribute("id"));
       // Assert.assertEquals("testing how robust the ByChained method is","a12",element.getClass("This is l paragraph text"));

    }


    @Test

    public void cssSelectorTest(){

        driver.navigate().to(s);
        WebElement element = driver.findElement(By.cssSelector("#a12.normal"));
        Assert.assertEquals("Verfiying the name of the above css selector value","pName12",element.getAttribute("name"));


    }

    @Test
    public void cssSelectorTest2()
    {

        driver.navigate().to(s);
       List <WebElement> elements = driver.findElements(By.cssSelector("[name^='pName']"));
       Assert.assertEquals("asserting there are 66 values",66,elements.size());
   }

    @Test

    public void cssSelectorTest3()
    {

        driver.navigate().to(s);
        List <WebElement> elements = driver.findElements(By.cssSelector("[class='nestedDiv']"));

       Set <String> tags = new HashSet<String>();

        for (WebElement e : elements ){

            tags.add(e.getTagName());
        }
        System.out.println(tags);
        Assert.assertTrue("asserting p values contained",tags.contains("div"));
    }

    @Test

    public void cssSelectorTest4(){



    }

    @AfterClass

    public static void quitDriver(){

        driver.quit();

    }
}
