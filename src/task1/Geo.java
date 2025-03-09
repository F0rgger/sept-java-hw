package task1;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Geo {
    private double lat;
    private double lng;

    public Geo(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }
}
