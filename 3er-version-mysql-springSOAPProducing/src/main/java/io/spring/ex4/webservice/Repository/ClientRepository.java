package io.spring.ex4.webservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.spring.ex4.webservice.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer>, JpaRepository<Client, Integer> {

	@Query("SELECT c FROM Client c WHERE c.nom = :nom AND c.prenom = :prenom AND c.carteCredit = :carteCredit")
	Client searchClient(@Param("nom") String nom, @Param("prenom") String prenom, @Param("carteCredit") String carteCredit);
}
