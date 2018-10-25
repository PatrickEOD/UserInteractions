package userInteraction.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import userInteraction.entities.Interactions;

public interface InteractionsRepository extends CrudRepository<Interactions, UUID> {

}
