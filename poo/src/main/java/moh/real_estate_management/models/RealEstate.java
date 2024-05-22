package moh.real_estate_management.models;

import lombok.Data;
import moh.real_estate_management.types.ListingType;
import moh.real_estate_management.types.PropertyAvailability;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class RealEstate {
    @Id
    private String id;
    private String name;
    private String address;
    private String description;
    private String city;
    private String state;
    private int price;
    private PropertyAvailability availability;
    private ListingType listingType;
    private String ownerId;
}
