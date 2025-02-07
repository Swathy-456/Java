package example1;

public class RegistrationForm

{
  String accountType;
  String currencyType;
  String prefixName;
  String firstName;
  String lastName;
  String phoneNumber;
  String dob;
  Address address;
  String citizenship;
  String marialStatus;
  String occupation;
  String employerName;
  String joinOwner;

    @Override
    public String toString() {
        return "RegistrationForm{" +
                "accountType='" + accountType + '\'' +
                ", currencyType='" + currencyType + '\'' +
                ", prefixName='" + prefixName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", dob='" + dob + '\'' +
                ", address=" + address +
                ", citizenship='" + citizenship + '\'' +
                ", marialStatus='" + marialStatus + '\'' +
                ", occupation='" + occupation + '\'' +
                ", employerName='" + employerName + '\'' +
                ", joinOwner='" + joinOwner + '\'' +
                '}';
    }
}
