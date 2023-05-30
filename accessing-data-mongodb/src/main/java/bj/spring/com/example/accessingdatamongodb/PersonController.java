package bj.spring.com.example.accessingdatamongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/customer")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public ResponseEntity<List<Person>> getallCustomers() {

        List<Person> persons = personService.findAll();

        return new ResponseEntity<List<Person>>(persons, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> createCustomer(@RequestBody Person person) {
        Person newPerson = personService.creatPerson(person);

        return new ResponseEntity<Person>(newPerson, HttpStatus.CREATED);
    }
}
