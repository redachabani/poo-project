package moh.real_estate_management.controllers;

import lombok.AllArgsConstructor;
import moh.real_estate_management.models.Transaction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@AllArgsConstructor
public class TransactionController {
    private final moh.real_estate_management.service.TransactionService TransactionService;

    @GetMapping("/all")
    public List<Transaction> getTransactions() {
        return TransactionService.getTransactions();
    }

    @PostMapping(value = "/add")
    public String addTransaction(@RequestBody Transaction transaction) {
        TransactionService.addTransaction(transaction);
        return "Transaction created successfully";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteTransaction(@PathVariable String id) {
        TransactionService.deleteTransaction(id);
        return "Transaction deleted successfully";
    }

    @GetMapping(value = "/get-transaction/{id}")
    public Transaction getTransaction(@PathVariable String id) {
        return TransactionService.getTransaction(id);
    }

}
