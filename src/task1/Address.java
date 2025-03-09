package task1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    public Address(String street, String suite, String city, String zipcode, double lng, double lat) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = new Geo(lng, lat);
    }

    public Address(String suite, String city, String zipcode, String street) {
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.street = street;

    }

}
