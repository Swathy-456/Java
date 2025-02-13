package example1;

public class Account {
    String accountType;
    String currencyType;
    String name;
    String dob;
    String phoneNumber;
    int age;


    Address address;
    Detail detail;
    Address customerAddress;


    @Override
    public String toString() {
        return "Account{" +
                "accountType='" + accountType + '\'' +
                ", currencyType='" + currencyType + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                ", detail=" + detail +
                ", customerAddress=" + customerAddress +
                '}';
    }
}