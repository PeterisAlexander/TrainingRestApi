package com.training.myrestapi.service;

import org.springframework.stereotype.Service;

import com.training.myrestapi.entities.PersonInformationEntity;
import com.training.myrestapi.repository.PersonInformationRepository;

@Service
public class PersonInformationService {
	private PersonInformationRepository pir;

    public PersonInformationService(PersonInformationRepository pir) { this.pir = pir;}

    public Iterable<PersonInformationEntity> findAll() { return pir.findAll();}
}
