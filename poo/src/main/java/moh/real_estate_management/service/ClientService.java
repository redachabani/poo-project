package moh.real_estate_management.service;

import com.mongodb.MongoException;
import lombok.AllArgsConstructor;
import moh.real_estate_management.models.Client;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientService {

    private final moh.real_estate_management.repository.ClientRepository ClientRepository;

    public List<Client> getClients() {
        try {
            return ClientRepository.findAll();
        } catch (MongoException e) {
            throw new RuntimeException("Failed to get clients", e);
        }
    }

    public Client getClient(String id) {
        try {
            return ClientRepository.findById(id);
        } catch (MongoException e) {
            throw new RuntimeException("Failed to get client", e);
        }
    }

    public void addClient(Client client) {
        try {
            ClientRepository.insert(client);
        } catch (MongoException e) {
            throw new RuntimeException("Failed to insert client", e);
        }
    }

    public void deleteClient(String id) {
        try {
            ClientRepository.deleteById(id);
        } catch (MongoException e) {
            throw new RuntimeException("Failed to delete client", e);
        }
    }


    public void addRealEstate(String id, String realEstateId) {
        try {
            Client client = ClientRepository.findById(id);
            client.getRealEstateIds().add(realEstateId);
            ClientRepository.save(client);
        } catch (MongoException e) {
            throw new RuntimeException("Failed to add real estate", e);
        }
    }

}
