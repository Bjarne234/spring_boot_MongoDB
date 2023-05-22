package bj.spring.com.example.accessingdatamongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

// Erweitert Funktion zu erstellen lesen schreiben und löschen / Erweitert MongoRepository-Schnittstelle
public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);

}
