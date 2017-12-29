package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.OnlineRegistration;
import utility.AppDriver;
import utility.GenericClass;

import static utility.AppDriver.driver;

public class TestSteps extends GenericClass {

    AppDriver ad = new AppDriver();

    @Given("^for url$")
    public void for_url() throws Throwable {
       ad.getUrl(readFile.readProperty(fileConfig, "url"));
    }

    @When("^user select class \"([^\"]*)\"$")
    public void user_select_class(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectStudentRegistrationClass(arg1);
    }

    @When("^enter applicants name \"([^\"]*)\"$")
    public void enter_applicants_name(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterApplicantName(arg1);
    }

    @When("^enter email id \"([^\"]*)\"$")
    public void enter_email_id(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterEMailId(arg1);
    }

    @When("^enter contact no \"([^\"]*)\"$")
    public void enter_contact_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterContactNo(arg1);
    }

    @When("^enter student first name \"([^\"]*)\"$")
    public void enter_student_first_name(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterFirstName(arg1);
    }

    @When("^enter student middle name \"([^\"]*)\"$")
    public void enter_student_middle_name(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterMiddlename(arg1);
    }

    @When("^enter student last name \"([^\"]*)\"$")
    public void enter_student_last_name(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterLastname(arg1);
    }

    @When("^enter date of birth as \"([^\"]*)\" year \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enter_date_of_birth_as_year_and(String arg1, String arg2, String arg3) throws Throwable {
        new OnlineRegistration(driver).enterDateOfBirth(arg1, arg2, arg3);
    }

    @When("^select student gender \"([^\"]*)\"$")
    public void select_student_gender(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectStudentGender(arg1);
    }

    @When("^select religion \"([^\"]*)\"$")
    public void select_religion(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectReligion(arg1);
    }

    @When("^select category \"([^\"]*)\"$")
    public void select_category(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectCategory(arg1);
    }

    @When("^enter nationality \"([^\"]*)\"$")
    public void enter_nationality(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterNationality(arg1);
    }

    @When("^select mother tongue \"([^\"]*)\"$")
    public void select_mother_tongue(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectMotherTongue(arg1);
    }

    @When("^enter student mobile no \"([^\"]*)\"$")
    public void enter_student_mobile_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterStudentMobileNo(arg1);
    }

    @When("^enter student email id \"([^\"]*)\"$")
    public void enter_student_email_id(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterStudentEmailId(arg1);
    }

    @When("^enter student po box no \"([^\"]*)\"$")
    public void enter_student_po_box_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterStudentPOBoxNo(arg1);
    }

    @When("^select student emirates \"([^\"]*)\"$")
    public void select_student_emirates(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectStudentEmirates(arg1);
    }

    @When("^select father title \"([^\"]*)\"$")
    public void select_father_title(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectFatherTitle(arg1);
    }

    @When("^enter father name \"([^\"]*)\"$")
    public void enter_father_name(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterFatherName(arg1);

    }

    @When("^select father religion \"([^\"]*)\"$")
    public void select_father_religion(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectFatherReligion(arg1);
    }

    @When("^enter father nationality \"([^\"]*)\"$")
    public void enter_father_nationality(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterFatherNationality(arg1);
    }

    @When("^enter father designation \"([^\"]*)\"$")
    public void enter_father_designation(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterFatherDesignation(arg1);
    }

    @When("^enter father office phone no \"([^\"]*)\"$")
    public void enter_father_office_phone_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterFatherOfficePhoneNo(arg1);
    }

    @When("^enter father office mobile no \"([^\"]*)\"$")
    public void enter_father_office_mobile_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterFatherOfficeMobileNo(arg1);
    }

    @When("^enter father home phone no \"([^\"]*)\"$")
    public void enter_father_home_phone_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterFatherHomePhoneNo(arg1);
    }

    @When("^enter father mobile no \"([^\"]*)\"$")
    public void enter_father_mobile_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterFatherMobileNo(arg1);
    }

    @When("^select mother title \"([^\"]*)\"$")
    public void select_mother_title(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectMotherTitle(arg1);
    }

    @When("^enter mother name \"([^\"]*)\"$")
    public void enter_mother_name(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterMotherName(arg1);
    }

    @When("^select mother religion \"([^\"]*)\"$")
    public void select_mother_religion(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectMotherReligion(arg1);
    }

    @When("^enter mother nationality \"([^\"]*)\"$")
    public void enter_mother_nationality(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterMotherNationality(arg1);
    }

    @When("^enter mother designation \"([^\"]*)\"$")
    public void enter_mother_designation(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterMotherDesignation(arg1);
    }

    @When("^enter mother office phone no \"([^\"]*)\"$")
    public void enter_mother_office_phone_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterMotherOfficePhoneNo(arg1);
    }

    @When("^enter mother office mobile no \"([^\"]*)\"$")
    public void enter_mother_office_mobile_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterMotherOfficeMobileNo(arg1);
    }

    @When("^enter mother home phone no \"([^\"]*)\"$")
    public void enter_mother_home_phone_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterMotherHomePhoneNo(arg1);
    }

    @When("^enter mother mobile no \"([^\"]*)\"$")
    public void enter_mother_mobile_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterMotherMobileNo(arg1);
    }

    @When("^select is sibling \"([^\"]*)\"$")
    public void select_is_sibling(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectIsSibling(arg1);
    }

    @When("^enter first sibling name \"([^\"]*)\"$")
    public void enter_first_sibling_name(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterFirstSiblingName(arg1);
    }

    @When("^enter first sibling class \"([^\"]*)\"$")
    public void enter_first_sibling_class(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectFirstSiblingClass(arg1);
    }

    @When("^enter first sibling admission no \"([^\"]*)\"$")
    public void enter_first_sibling_admission_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterFirstSiblingAdmissionNo(arg1);
    }

    @When("^enter second sibling name \"([^\"]*)\"$")
    public void enter_second_sibling_name(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterSecondSiblingName(arg1);
    }

    @When("^enter second sibling class \"([^\"]*)\"$")
    public void enter_second_sibling_class(String arg1) throws Throwable {
        new OnlineRegistration(driver).selectSecondSiblingClass(arg1);
    }

    @When("^enter second sibling admission no \"([^\"]*)\"$")
    public void enter_second_sibling_admission_no(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterSecondSiblingAdmissionNo(arg1);
    }

    @When("^enter no of boys \"([^\"]*)\"$")
    public void enter_no_of_boys(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterNoOfBoys(arg1);
    }

    @When("^enter no of girls \"([^\"]*)\"$")
    public void enter_no_of_girls(String arg1) throws Throwable {
        new OnlineRegistration(driver).enterNoOfGirls(arg1);
    }

    @Then("^click next$")
    public void click_next() throws Throwable {
        new OnlineRegistration(driver).clickNext();
    }

    @Then("^make payment$")
    public void makePayment() throws Throwable {
        new OnlineRegistration(driver).enterCardNumber();
        new OnlineRegistration(driver).enterExpiryDate();
        new OnlineRegistration(driver).enterExpiryYear();
        new OnlineRegistration(driver).enterCvv();
        new OnlineRegistration(driver).clickPay();
    }
}