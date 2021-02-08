package com.yus.tests;
import com.yus.pages.LandingPage;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public final class LandingPageTest extends BaseTest {
   private LandingPageTest()
   {

   }
    LandingPage landingPage = new LandingPage();

    @Test
    public void checkLandingPageTitle()
    {
        String title = landingPage.getLandingPageTitle();
        System.out.println("Landing page Title si found as :"+title);
        Assertions.assertThat(title).isNotBlank().isNotEmpty().isEqualTo("My Store");


    }
    @Test
    public void checkLandingPageLogo()
    {
        boolean logo = landingPage.getLandingPageLogo();
        System.out.println("Logis present on landing page? : "+logo);
        Assertions.assertThat(logo).isFalse();

    }

}
