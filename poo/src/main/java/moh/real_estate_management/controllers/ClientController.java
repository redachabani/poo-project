package moh.real_estate_management.controllers;

import lombok.AllArgsConstructor;
import moh.real_estate_management.service.ClientService;
import moh.real_estate_management.models.Client;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/all")
    public List<Client> getClients() {
        return clientService.getClients();
    }

    @GetMapping(value = "/get-client/{id}")
    public Client getClient(@PathVariable String id) {
        return clientService.getClient(id);
    }

    @PostMapping(value = "/add")
    public String addClient(@RequestBody Client client) {
        clientService.addClient(client);
        return "Client created successfully";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteClient(@PathVariable String id) {
        clientService.deleteClient(id);
        return "Client deleted successfully";
    }

}
