package moh.real_estate_management.repository;

import moh.real_estate_management.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends MongoRepository<Client, Long> {
    Client findById(String id);
    void deleteById(String id);
}
