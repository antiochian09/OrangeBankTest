package com.OrangeBank.StepDefinitions;

import com.OrangeBank.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MyStepDefs {

    @When("User open the {string}")
    public void userOpenThe(String url) throws InterruptedException {
        Driver.get().get(url);
        Thread.sleep(1000);
    }

    @And("User type {string} in the search box")
    public void userTypeInTheSearchBox(String wordsToSearch) throws InterruptedException {
        Driver.get().findElement(By.id("L2AGLb")).click();
        WebElement searchBox = Driver.get().findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        searchBox.sendKeys(wordsToSearch+ Keys.ENTER);
        Thread.sleep(2000);
    }

    @Then("Verify number of results is more than {int} and is not less than {int}")
    public void verifyNumberOfResultsIsMoreThan(int BigNumber, int smallNumber) {
        String resultsString = Driver.get().findElement(By.id("result-stats")).getText();
        resultsString=resultsString.replace(",","");
        String[] listOfResultsString = resultsString.split(" ");
        long resultNumber = Long.parseLong(listOfResultsString[1]);
        Assert.assertTrue(resultNumber>BigNumber);
        Assert.assertFalse(resultNumber<smallNumber);

    }
}
