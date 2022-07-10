package rocks.zipcode;

public class Address {
    private String street;
    private String town;
    private String postCode;
    private String country;

    public Address(String street, String town, String postCode) {
        this(street, town, postCode, "");
    }

    public Address(String street, String town, String postCode, String country) {
        this.street = street;
        this.town = town;
        this.postCode = postCode;
        this.country = country;
    }

    public String toString() {
        return street + "\n" + town + " " + postCode + "\n" + country + "\n";
    }
}
