package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {

    //resultMessage locator and create methods 'String getResultMessage()' and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You do not need a visa for some business and acade')]")
    WebElement resultMessage1;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement resultMessage2;

    public String getResultMessage(String text){
        text = getTextFromElement(resultMessage);
        log.info("Getting result: " +resultMessage.toString());
        return text;

    }
    public String getResultMsg(String text){
        text = getTextFromElement(resultMessage1);
        log.info("Getting result: " +resultMessage1.toString());
        return text;
    }
    public String getResultMsg1(String text){
        text = getTextFromElement(resultMessage2);
        log.info("Getting result: " +resultMessage2.toString());
        return text;
    }


}
