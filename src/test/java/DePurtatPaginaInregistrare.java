import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DePurtatPaginaInregistrare extends BaseClass {

   @Test
    public void inregistrareDateInvalide(){
       getDriver().get("https://www.depurtat.ro/");

       WebElement butonAutentificare=getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/a/img"));
       butonAutentificare.click();

       WebElement butonAccesarePaginaInregistrare=getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/div/a[2]"));
       butonAccesarePaginaInregistrare.click();

       Assert.assertEquals(getDriver().getTitle(),"dEpurtat - Inregistrare");
       WebElement inputEmail=getDriver().findElement(By.id("profile_email"));
       WebElement inputPassword=getDriver().findElement(By.id("profile_password"));
       WebElement inputNumeSiPrenume=getDriver().findElement(By.id("profile_billing_person_name"));
       WebElement inputOras=getDriver().findElement(By.id("profile_billing_city"));
       WebElement inputAdresa=getDriver().findElement(By.id("profile_billing_address"));
       WebElement inputNumarTelefon=getDriver().findElement(By.id("profile_billing_phone"));


       inputEmail.sendKeys("paulet.catalin@yahoo.ro");
       inputPassword.sendKeys("abcdurs");
       inputNumeSiPrenume.sendKeys("Catalin Andrei");
       inputOras.sendKeys("Iasi");
//       Select oras=new Select(getDriver().findElement(By.xpath("//*[@id=\"profile_billing_city\"]")));
//       oras.selectByVisibleText("Iasi")
       inputAdresa.sendKeys("Str Cerna");
       inputNumarTelefon.sendKeys("0744933999");

       WebElement butonAcceptareTermeniSiConditii=getDriver().findElement(By.xpath("//*[@id=\"user_account_fields\"]/div[10]/div/div/div/label"));
       Assert.assertFalse(butonAcceptareTermeniSiConditii.isSelected());

       WebElement butonInregistrare=getDriver().findElement(By.xpath("//*[@id=\"user_account_fields\"]/div[10]/button"));
       butonInregistrare.click();


   }
@Test
   public void autentificareClientDePePaginaInregistrare(){
       getDriver().navigate().to("https://www.depurtat.ro/");
       WebElement butonAutentificare=getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/a/img"));
       butonAutentificare.click();
       WebElement butonAccesarePaginaInregistrare=getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/div/a[2]"));
       butonAccesarePaginaInregistrare.click();
       Assert.assertEquals(getDriver().getTitle(),"dEpurtat - Inregistrare");

       WebElement butonAccesareCont=getDriver().findElement(By.xpath("//*[@id=\"page_signup_form\"]/div/div[2]/p[2]/a"));
       butonAccesareCont.click();

       Assert.assertEquals(getDriver().getTitle(), "Acces cont - dEpurtat");


   }

   @Test
    public void comandaRapidaFaraInregistrareSiAutentificare(){
       getDriver().navigate().to("https://www.depurtat.ro/");
       WebElement butonAutentificare=getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/a/img"));
       butonAutentificare.click();
       WebElement butonAccesarePaginaInregistrare=getDriver().findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[1]/div/div[1]/div/a[2]"));
       butonAccesarePaginaInregistrare.click();
       Assert.assertEquals(getDriver().getTitle(),"dEpurtat - Inregistrare");

       WebElement butonComandaRapida=getDriver().findElement(By.xpath("//*[@id=\"page_signup_form\"]/div/div[2]/p[4]/a"));
       butonComandaRapida.click();

       WebElement inputEmail=getDriver().findElement(By.id("profile_email"));
       WebElement inputNumeSiPrenume=getDriver().findElement(By.id("profile_billing_person_name"));
       WebElement inputOras=getDriver().findElement(By.id("profile_billing_city"));

       WebElement inputAdresa=getDriver().findElement(By.id("profile_billing_address"));
       WebElement inputNumarTelefon=getDriver().findElement(By.id("profile_billing_phone"));

       inputEmail.sendKeys("blabla@yahoo.ro");
       inputNumeSiPrenume.sendKeys("bla junior");
       inputOras.sendKeys("Iasi");
       inputAdresa.sendKeys("zona viselor");
       inputNumarTelefon.sendKeys("0744998899");
       WebElement butonAcceptareConditii=getDriver().findElement(By.id("confirm_terms_desktop"));
//       for (int i=0;i<2;i++){
//           butonAcceptareConditii.click();
//           System.out.println(butonAcceptareConditii.isSelected());
//       }

       Assert.assertFalse(butonAcceptareConditii.isSelected());

       WebElement butonComanda=getDriver().findElement(By.xpath("/html/body/main/div/div/div/form/div/div[1]/div[10]/button"));
       butonComanda.click();






   }







}
