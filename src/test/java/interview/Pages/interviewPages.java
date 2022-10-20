package interview.Pages;

import interview.Utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class interviewPages {
    public interviewPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
