package com.ecommerce.registration.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.registration.entities.RegistrationEntity;


@Repository
public interface RegistrationRepository extends CrudRepository<RegistrationEntity, Long> {

}
