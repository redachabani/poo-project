package moh.real_estate_management.repository;

import moh.real_estate_management.models.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository  extends MongoRepository<Transaction, Long>{
    Transaction findById(String id);
    void deleteById(String id);
}
