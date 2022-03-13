package pages.weborderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class CreateGroupOrderPage {
    public CreateGroupOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="InviteNote")
    private WebElement InviteNote;
    @FindBy(id="InviteList")
    private WebElement inviteList;
    @FindBy(id="addressPreview")
    private WebElement officeAdress;
    @FindBy(id="createGroupOrder")
    private WebElement groupOrder;
    @FindBy(xpath= "//h1")
    private WebElement headertext;
    @FindBy(xpath = "//label[.='Total Participants:']//following-sibling::div")
    private WebElement totalParticipants;

    public void sendInviteNote(String invitationNotes){
        InviteNote.sendKeys(invitationNotes);
    }
    public void sendInviteList(String invitationList){
        inviteList.sendKeys(invitationList);

    }
    public String getOfficeAdress(){
       return BrowserUtils.getTextMethod(officeAdress);
    }
    public void clickCreateGroupButton(){
        groupOrder.click();
    }
    public String getHeaderText() throws InterruptedException {
        Thread.sleep(1000);
        return headertext.getText().trim();

    }
    public int getParticipants(){
        return Integer.parseInt(totalParticipants.getText().trim());
    }


}
