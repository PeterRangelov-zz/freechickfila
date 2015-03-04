package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.gargoylesoftware.htmlunit.html.*;
import play.*;
import play.mvc.*;

import util.Constants;
import views.html.*;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;

import java.io.IOException;
import java.util.Map;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    public static Result getCode() throws FailingHttpStatusCodeException, IOException, InterruptedException {
        System.out.println("Obtaining validation code ...");

        Map<String, String[]> reqBody = request().body().asFormUrlEncoded();

        WebClient client = new WebClient(BrowserVersion.CHROME);

        client.getOptions().setCssEnabled(false);
        client.getOptions().setThrowExceptionOnScriptError(false);
        client.getOptions().setThrowExceptionOnFailingStatusCode(false);
        client.getOptions().setPopupBlockerEnabled(true);
        client.getOptions().setUseInsecureSSL(true);
        HtmlPage page = client.getPage(Constants.STARTING_URL);

        page.getHtmlElementById(Constants.PAGE_1_TEXTBOX_1).type(reqBody.get("sn1")[0]);
        page.getHtmlElementById(Constants.PAGE_1_TEXTBOX_2).type(reqBody.get("sn2")[0]);
        page.getHtmlElementById(Constants.PAGE_1_TEXTBOX_3).type(reqBody.get("sn3")[0]);
        page.getHtmlElementById(Constants.PAGE_1_TEXTBOX_4).type(reqBody.get("sn4")[0]);
        page.getHtmlElementById(Constants.PAGE_1_TEXTBOX_5).type(reqBody.get("sn5")[0]);
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        page.getHtmlElementById(Constants.PAGE_2_RADIOBUTTON).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        page.getHtmlElementById(Constants.PAGE_3_RADIOBUTTON).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        HtmlDivision div = page.getFirstByXPath("//div[@id='surveyQuestions']");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[5]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[10]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[15]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[20]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[5]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[10]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[15]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[20]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[5]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[10]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[15]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[20]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[2]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[1]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlCheckBoxInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='checkbox'])[1]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlCheckBoxInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='checkbox'])[1]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[5]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[10]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[15]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[20]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[5]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[10]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[5]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[10]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // Select 5th checkbox
        ((HtmlCheckBoxInput) page.getFirstByXPath("(//input[@type='checkbox'])[5]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//input[@type='radio'])[6]")).setAttribute("checked", "checked");
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//input[@type='radio'])[12]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlSelect) page.getFirstByXPath("(//select)[1]")).getOptionByText("3 times").setSelected(true);
        ((HtmlSelect) page.getFirstByXPath("(//select)[2]")).getOptionByText("3 times").setSelected(true);
        ((HtmlSelect) page.getFirstByXPath("(//select)[3]")).getOptionByText("3 times").setSelected(true);
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[1]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlTextInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='text'])[1]")).type("21215");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // GENDER PAGE WHOA!! TRICKY!
        try {
            ((HtmlSelect) page.getFirstByXPath("(//select)[1]")).getOptionByText("Prefer not to answer").setSelected(true);
            ((HtmlSelect) page.getFirstByXPath("(//select)[2]")).getOptionByText("Prefer not to answer").setSelected(true);
            ((HtmlSelect) page.getFirstByXPath("(//select)[3]")).getOptionByText("Prefer not to answer").setSelected(true);
            ((HtmlSelect) page.getFirstByXPath("(//select)[4]")).getOptionByText("Prefer not to answer").setSelected(true);
            System.out.println("Gender page displayed");
            page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();
//            String code = ((HtmlParagraph) page.getFirstByXPath("(//p[@class='ValCode'])")).asXml().replaceAll("\\D+","");
        }

        catch (NullPointerException e) {
            System.out.println("Gender page not displayed");

        }

        finally {
            String code = ((HtmlParagraph) page.getFirstByXPath("(//p[@class='ValCode'])")).asXml().replaceAll("\\D+","");



//	    System.out.println(page.getBody().asXml());

//        System.out.println(code);

            client.closeAllWindows();
            return ok(code);
//        return ok(page.getBody().asXml());


        }





    }

}
