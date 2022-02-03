package com.training.myrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.myrestapi.entities.PersonInformationEntity;


public interface PersonInformationRepository extends JpaRepository<PersonInformationEntity, Integer> {

}
