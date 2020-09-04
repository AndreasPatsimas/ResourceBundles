package org.patsimas.resource_bundles.dto;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Aris {

    private String vatNumber;
    private String companyName;
    private String countryName;
    private String address;
    private String cityName;
    private String region;
    private String postalCode;
    private String internationalDialingCode;
    private String telephone;
    private String url;
    private String email;
    private String products;
    private String responsiblesName;
    private String yearEstablished;
}
