package example1;

public class Bank
{
    public static void main(String[] args)
    {
        RegistrationForm sriRegistrationForm=new RegistrationForm();
        sriRegistrationForm.accountType="Fixed Deposit";
        sriRegistrationForm.currencyType="Rupee";
        sriRegistrationForm.prefixName="Miss";
        sriRegistrationForm.firstName="Swathi";
        sriRegistrationForm.lastName="Sri";
        sriRegistrationForm.phoneNumber="+91 9087654321";
        sriRegistrationForm.dob="10/3/2008";
        sriRegistrationForm.age=17;



        Address sriAddress=new Address();
        sriAddress.street="Raja nagar";
        sriAddress.city="Trichy";
        sriAddress.state="Tamilnadu";
        sriAddress.pincode="643120";
        sriAddress.country="India";

        sriRegistrationForm.address=sriAddress;

        Detail customerDetail=new Detail();
        customerDetail.citizenship="Indian citizen";
        customerDetail.marialStatus="Ummarried";
        customerDetail.occupation="Enginner";
        customerDetail.employerName="Swathi Sri";
        customerDetail.joinOwner="No";

       // sriRegistrationForm.detail=customerDetail;

        System.out.println("Bank Account Registration Form: "+sriRegistrationForm);
      Service service=new Service();
      service.registrationService(sriRegistrationForm);
      System.out.println("Registration Form="+service);


    }
}
