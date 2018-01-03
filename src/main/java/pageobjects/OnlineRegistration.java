package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.FindFailed;
import utility.GenericClass;

import java.io.IOException;
import java.util.List;

public class OnlineRegistration extends GenericClass {

    private String cardNo = "5123 4567 8901 2346";
    private String expiryDate = "05";
    private String expiryYear = "20";
    private String cvv = "123";

    public OnlineRegistration(WebDriver d) {
        page = this.getClass().getSimpleName();
        file = gm.getFilePath(page);
        PageFactory.initElements(d, this);
    }

    public void selectStudentRegistrationClass(String cls) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("studentregistrationclass"), cls);
    }

    public void enterApplicantName(String name) throws IOException {
        ehandler.enterText(readFile.getElement("applicantsname"), name);
    }

    public void enterEMailId(String email) throws IOException {
        ehandler.enterText(readFile.getElement("emailid"), email);
    }

    public void enterContactNo(String cno) throws IOException {
        ehandler.enterText(readFile.getElement("contactno"), cno);
    }

    public void enterFirstName(String fname) throws IOException {
        ehandler.enterText(readFile.getElement("firstname"), fname);
    }

    public void enterMiddlename(String mname) throws IOException {
        ehandler.enterText(readFile.getElement("middlename"), mname);
    }

    public void enterLastname(String lname) throws IOException {
        ehandler.enterText(readFile.getElement("lastname"), lname);
    }

    public void enterDateOfBirth(String mm, String yy, String dd) throws IOException, InterruptedException {
        ehandler.selectDate(readFile.getElement("dob"), mm, yy, dd);
    }

    public void selectStudentGender(String gender) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("gender"), gender);
    }

    public void selectReligion(String religion) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("studentreligion"), religion);
        if (religion.equalsIgnoreCase("CHRISTIAN")){
            Thread.sleep(1000);
            enterParish("aa");
        }
    }

    public void enterParish(String parish) throws IOException {
        ehandler.enterText(readFile.getElement("studentparish"), parish);
    }

    public void selectCategory(String category) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("category"), category);
    }

    public void enterNationality(String nationality) throws IOException {
        ehandler.enterText(readFile.getElement("nationality"), nationality);
    }

    public void selectMotherTongue(String mtongue) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("mothertongue"), mtongue);
    }

    public void enterStudentMobileNo(String mobileno) throws IOException {
        ehandler.enterText(readFile.getElement("studentmobileno"), mobileno);
    }

    public void enterStudentEmailId(String email) throws IOException {
        ehandler.enterText(readFile.getElement("studentemailid"), email);
    }

    public void enterStudentPOBoxNo(String pono) throws IOException {
        ehandler.enterText(readFile.getElement("studentpoboxno"), pono);
    }

    public void selectStudentEmirates(String emirate) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("studentemirates"), emirate);
    }

    public void selectFatherTitle(String title) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("fathertitle"), title);
    }

    public void enterFatherName(String name) throws IOException {
        ehandler.enterText(readFile.getElement("fathername"), name);
    }

    public void selectFatherReligion(String religion) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("fatherreligion"), religion);
        if (religion.equalsIgnoreCase("CHRISTIAN")){
            Thread.sleep(1000);
            enterFatherParish("aa");
        }
    }

    public void enterFatherParish(String parish) throws IOException {
        ehandler.enterText(readFile.getElement("fatherparish"), parish);
    }

    public void enterFatherNationality(String nationality) throws IOException {
        ehandler.enterText(readFile.getElement("fathernationality"), nationality);
    }

    public void enterFatherDesignation(String desig) throws IOException {
        ehandler.enterText(readFile.getElement("fatherdesignation"), desig);
    }

    public void enterFatherOfficePhoneNo(String pno) throws IOException {
        ehandler.enterText(readFile.getElement("fatherofficeteleno"), pno);
    }

    public void enterFatherOfficeMobileNo(String pno) throws IOException {
        ehandler.enterText(readFile.getElement("fatherofficemobileno"), pno);
    }

    public void enterFatherHomePhoneNo(String pno) throws IOException {
        ehandler.enterText(readFile.getElement("fatherhometeleno"), pno);
    }

    public void enterFatherMobileNo(String pno) throws IOException {
        ehandler.enterText(readFile.getElement("fathermobileno"), pno);
    }

    public void selectMotherTitle(String title) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("mothertitle"), title);
    }

    public void enterMotherName(String name) throws IOException {
        ehandler.enterText(readFile.getElement("mothername"), name);
    }

    public void selectMotherReligion(String religion) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("motherreligion"), religion);
        if (religion.equalsIgnoreCase("CHRISTIAN")){
            Thread.sleep(1000);
            enterMotherParish("aa");
        }
    }

    public void enterMotherParish(String parish) throws IOException {
        ehandler.enterText(readFile.getElement("motherparish"), parish);
    }

    public void enterMotherNationality(String nationality) throws IOException {
        ehandler.enterText(readFile.getElement("mothernationality"), nationality);
    }

    public void enterMotherDesignation(String desig) throws IOException {
        ehandler.enterText(readFile.getElement("motherdesignation"), desig);
    }

    public void enterMotherOfficePhoneNo(String pno) throws IOException {
        ehandler.enterText(readFile.getElement("motherofficeteleno"), pno);
    }

    public void enterMotherOfficeMobileNo(String pno) throws IOException {
        ehandler.enterText(readFile.getElement("motherofficemobileno"), pno);
    }

    public void enterMotherHomePhoneNo(String pno) throws IOException {
        ehandler.enterText(readFile.getElement("motherhometeleno"), pno);
    }

    public void enterMotherMobileNo(String pno) throws IOException {
        ehandler.enterText(readFile.getElement("mothermobileno"), pno);
    }

    public void selectIsSibling(String value) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("issibling"), value);
        Thread.sleep(1000);
    }

    public void enterFirstSiblingName(String name) throws IOException {
        ehandler.enterText(readFile.getElement("firstsiblingname"), name);
    }

    public void selectFirstSiblingClass(String cls) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("firstsiblingclass"), cls);
    }

    public void enterFirstSiblingAdmissionNo(String admno) throws IOException {
        ehandler.enterText(readFile.getElement("firstsiblingadmissionno"), admno);
    }

    public void enterSecondSiblingName(String name) throws IOException {
        ehandler.enterText(readFile.getElement("secondsiblingname"), name);
    }

    public void selectSecondSiblingClass(String cls) throws IOException, InterruptedException {
        ehandler.selectByVisibleText(readFile.getElement("secondsiblingclass"), cls);
    }

    public void enterSecondSiblingAdmissionNo(String admno) throws IOException {
        ehandler.enterText(readFile.getElement("secondsiblingadmissionno"), admno);
    }

    public void enterNoOfBoys(String no) throws IOException {
        ehandler.enterText(readFile.getElement("noofboys"), no);
    }

    public void enterNoOfGirls(String no) throws IOException {
        ehandler.enterText(readFile.getElement("noofgirls"), no);
    }

    public void clickNext() throws IOException, InterruptedException {
        ehandler.click(readFile.getElement("next"));
        Thread.sleep(2000);
        ehandler.switchToAlert();
    }

    public void clickProceedToOnlinePayment() throws IOException, InterruptedException {
        ehandler.click(readFile.getElement("proceedtoonlinepayment"));
        Thread.sleep(5000);
    }

    public void clickDebitCreditCard() throws IOException, InterruptedException {
        ehandler.click(readFile.getElement("debitcreditcard"));
        Thread.sleep(4000);
    }

    public void enterCardNumber() throws IOException {
        ehandler.enterText(readFile.getElement("cardnumber"), cardNo);
    }

    public void enterExpiryDate() throws IOException {
        ehandler.enterText(readFile.getElement("expirydate"), expiryDate);
    }

    public void enterExpiryYear() throws IOException {
        ehandler.enterText(readFile.getElement("expiryyear"), expiryYear);
    }

    public void enterCvv() throws IOException, InterruptedException {
        ehandler.enterText(readFile.getElement("cvvno"), cvv);
        Thread.sleep(2000);
    }

    public void clickPay() throws IOException {
        ehandler.click(readFile.getElement("clickpay"));
    }

    public void uploadPhoto() throws IOException, FindFailed, InterruptedException {
        ehandler.click(readFile.getElement("choosefile"));
        Thread.sleep(1000);
        ehandler.getImage(readFile.readProperty(file, "studentimage"));
        ehandler.click(readFile.getElement("upload"));
        Thread.sleep(200);
        ehandler.cropImage(readFile.getElement("cropimage"));
        ehandler.click(readFile.getElement("crop"));
        ehandler.switchToAlert();
    }

    public void uploadPhotos(List<java.util.List<String>> data) throws IOException, FindFailed, InterruptedException {
        for (List<String> value: data){
            if (value.get(0).equals("student photo")){
                ehandler.getPhoto(readFile.getElement("choosefile"), readFile.readProperty(file, "studentimage"));
            }
            if (value.get(0).equals("photo with parents")){
                ehandler.getPhoto(readFile.getElement("choosefile1"), readFile.readProperty(file, "withparentsimage"));
            }
            if (value.get(0).equals("birth certificate")){
                ehandler.getPhoto(readFile.getElement("choosefile2"), readFile.readProperty(file, "bc"));
            }
            if (value.get(0).equals("address proof")){
                ehandler.getPhoto(readFile.getElement("choosefile3"), readFile.readProperty(file, "addressproof"));
            }
        }
    }
}