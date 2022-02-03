package com.training.myrestapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.myrestapi.entities.PersonInformationEntity;
import com.training.myrestapi.service.PersonInformationService;


/**
 * @author DESGOUILLES Pierre
 *
 */
@RestController
@RequestMapping("/api/persons")
public class PersonInformationAPIController {
	PersonInformationService pis;

    public PersonInformationAPIController(PersonInformationService pis) { this.pis = pis;}

    //http://localhost:8080/api/persons
    @GetMapping(value = "", produces = "application/json")
    public Iterable<PersonInformationEntity> getAll() { return pis.findAll();}
}
