package org.patsimas.resource_bundles.services;

import org.patsimas.resource_bundles.dto.Aris;
import org.patsimas.resource_bundles.enums.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class ArisService {

    @Autowired
    MessageSource resources;

    public Aris fetchAreianara(Locale locale){

        return Aris.builder()
                .vatNumber(resources.getMessage("vat.number", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .companyName(resources.getMessage("company.name", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .countryName(resources.getMessage("country.name", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .address(resources.getMessage("company.address", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .cityName(resources.getMessage("city.name", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .region(resources.getMessage("region", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .postalCode(resources.getMessage("postal.code", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .internationalDialingCode(resources.getMessage("international.dialing.code", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .telephone(resources.getMessage("telephone", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .url(resources.getMessage("url", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .email(resources.getMessage("email", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .products(resources.getMessage("products", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .responsiblesName(resources.getMessage("responsibles.names", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .yearEstablished(resources.getMessage("year.established", new Object[]{""}, "", new java.util.Locale(locale.code())))
                .build();
    }
}
