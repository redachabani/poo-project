package moh.real_estate_management.repository;

import moh.real_estate_management.models.RealEstate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RealEstateRepository extends MongoRepository<RealEstate, Long>{
    RealEstate findById(String id);
    void deleteById(String id);
}
