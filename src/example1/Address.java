package example1;

public class Address
{
    String street;

    String state;

    String city;

    String pincode;

    String country;


    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}

