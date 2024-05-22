package moh.real_estate_management.models;

import lombok.Data;
import moh.real_estate_management.types.TransactionType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Transaction {
    @Id
    private String id;
    private String realEstateId;
    private String buyerId;
    private TransactionType transactionType;
    private int transactionFee;
}
