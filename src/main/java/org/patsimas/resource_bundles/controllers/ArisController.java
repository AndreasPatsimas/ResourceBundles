package org.patsimas.resource_bundles.controllers;

import org.patsimas.resource_bundles.dto.Aris;
import org.patsimas.resource_bundles.enums.Locale;
import org.patsimas.resource_bundles.services.ArisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArisController {

    @Autowired
    private ArisService arisService;

    @GetMapping("/aris/super-3-/fetch/{locale}")
    Aris getAreianara(@PathVariable Locale locale){

        return arisService.fetchAreianara(locale);
    }
}
