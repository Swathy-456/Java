package example1;

import javax.imageio.spi.RegisterableService;

public class Service {
//    public Account registrationService(RegistrationForm registrationForm)
//    {
//        Account account=new Account();
//        account.accountType=registrationForm.accountType;
//        account.currencyType=registrationForm.currencyType;
//        account.name=registrationForm.prefixName+registrationForm.firstName+registrationForm.lastName;
//        account.phoneNumber=registrationForm.phoneNumber;
//        account.dob=registrationForm.dob;
//
//        Address bankAddress=new Address();
//        bankAddress.street="Rajeswari street";
//        bankAddress.city="Chennai";
//        bankAddress.state="Tamilnadu";
//        bankAddress.pincode="621601";
//        bankAddress.country="India";
//        account.customerAddress=registrationForm.address;
//
//        account.address=bankAddress;
//
//        Detail customerDetail=new Detail();
//        customerDetail.citizenship="Indian citizen";
//        customerDetail.marialStatus="Ummarried";
//        customerDetail.occupation="Enginner";
//        customerDetail.employerName="Swathi Sri";
//        customerDetail.joinOwner="No";
//
//        account.detail=customerDetail;
//
//
//
//
//        System.out.println("Customer account="+ account);
//
//
//        return account;




    public void registrationService(RegistrationForm registrationForm)
    {
        Account accountType=new Account();
        accountType.accountType=registrationForm.accountType;
        accountType.currencyType=registrationForm.currencyType;
        accountType.name=registrationForm.prefixName+registrationForm.firstName+registrationForm.lastName;
        accountType.phoneNumber=registrationForm.phoneNumber;
        accountType.dob=registrationForm.dob;

        Address bankAddress=new Address();
        bankAddress.street="Rajeshwari street";
        bankAddress.city="Chennai";
        bankAddress.state="Tamilnadu";
        bankAddress.pincode="621601";
        bankAddress.country="India";
        accountType.customerAddress=registrationForm.address;

        accountType.address=bankAddress;

        Detail customerDetail=new Detail();
        customerDetail.citizenship="Indian citizen";
        customerDetail.marialStatus="Ummaried";
        customerDetail.occupation="Engineer";
        customerDetail.employerName="Swathi Sri";
        customerDetail.joinOwner="No";
        accountType.detail=customerDetail;

        System.out.println("Customer account="+ accountType);

    }
}
