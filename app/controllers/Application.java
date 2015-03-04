package controllers;

import play.*;
import play.mvc.*;

import util.Constants;
import views.html.*;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlCheckBoxInput;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlOption;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlParagraph;
import com.gargoylesoftware.htmlunit.html.HtmlRadioButtonInput;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import java.io.IOException;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    public static Result getCode() throws FailingHttpStatusCodeException, IOException, InterruptedException {
        WebClient client = new WebClient(BrowserVersion.CHROME);

        client.getOptions().setCssEnabled(false);
        client.getOptions().setThrowExceptionOnScriptError(false);
        client.getOptions().setThrowExceptionOnFailingStatusCode(false);
        client.getOptions().setPopupBlockerEnabled(true);
        client.getOptions().setUseInsecureSSL(true);
        HtmlPage page = client.getPage(Constants.STARTING_URL);

        page.getHtmlElementById(Constants.PAGE_1_TEXTBOX_1).type("");
        page.getHtmlElementById(Constants.PAGE_1_TEXTBOX_2).type("");
        page.getHtmlElementById(Constants.PAGE_1_TEXTBOX_3).type("");
        page.getHtmlElementById(Constants.PAGE_1_TEXTBOX_4).type("");
        page.getHtmlElementById(Constants.PAGE_1_TEXTBOX_5).type("");
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

        // NEXT PAGE
        ((HtmlOption) page.getFirstByXPath("(//div[@id='surveyQuestions']//option)[2]")).setAttribute("selected", "selected");
        ((HtmlOption) page.getFirstByXPath("(//div[@id='surveyQuestions']//option)[13]")).setAttribute("selected", "selected");
        ((HtmlOption) page.getFirstByXPath("(//div[@id='surveyQuestions']//option)[24]")).setAttribute("selected", "selected");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[2]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlRadioButtonInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='radio'])[1]")).setAttribute("checked", "checked");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();

        // NEXT PAGE
        ((HtmlTextInput) page.getFirstByXPath("(//div[@id='surveyQuestions']//input[@type='text'])[1]")).type("21215");
        page = ((HtmlSubmitInput) page.getElementById(Constants.NEXT_BUTTON)).click();




        String code = ((HtmlParagraph) page.getFirstByXPath("(//div[@id='finishIncentiveHolder']//p)[3]")).asXml().replaceAll("\\D+","");


//	    System.out.println(page.getBody().asXml());
        System.out.println(code);

        client.closeAllWindows();
        return ok(code);
    }

}
