package moh.real_estate_management.service;

import com.mongodb.MongoException;
import lombok.AllArgsConstructor;
import moh.real_estate_management.models.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TransactionService {
    private final moh.real_estate_management.repository.TransactionRepository TransactionRepository;

    public List<Transaction> getTransactions() {
        try {
            return TransactionRepository.findAll();
        } catch (MongoException e) {
            throw new RuntimeException("Failed to get real estates", e);
        }
    }

    public void addTransaction(Transaction transaction) {
        try {
            TransactionRepository.insert(transaction);
        } catch (MongoException e) {
            throw new RuntimeException("Failed to add transaction", e);
        }
    }

    public void deleteTransaction(String id) {
        try {
            TransactionRepository.deleteById(id);
        } catch (MongoException e) {
            throw new RuntimeException("Failed to delete transaction", e);
        }
    }

    public Transaction getTransaction(String id) {
        try {
            return TransactionRepository.findById(id);
        } catch (MongoException e) {
            throw new RuntimeException("Failed to get transaction", e);
        }
    }

}
