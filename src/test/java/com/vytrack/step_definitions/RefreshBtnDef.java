package com.vytrack.step_definitions;

import com.vytrack.pages.FleetManagementPage;
import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RefreshBtnDef {
    FleetManagementPage fleetManagementPage = new FleetManagementPage();
    VehiclesPage vehiclesPage = new VehiclesPage();
    Wait wait = new WebDriverWait(Driver.getDriver(), 20);
    @Given("the user should be able to click on the refresh button")
    public void the_user_should_be_able_to_click_on_the_refresh_button() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(vehiclesPage.refreshBtn));
        Assert.assertTrue(vehiclesPage.refreshBtn.isDisplayed());

    }
}
