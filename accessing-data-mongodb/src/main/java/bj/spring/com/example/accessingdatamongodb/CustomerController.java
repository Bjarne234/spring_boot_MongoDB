package bj.spring.com.example.accessingdatamongodb;

import lombok.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.annotation.Id;
import java.util.List;

@RestController
public class CustomerController {
    PersonService personService;

    @Autowired
    public CustomerController(PersonService personService) {
        this.personService = personService;
    }

    // get Entpunkt
    @GetMapping("/person/all")
    public Person getAll() {
        return personService.getAll();
    }

    // post Endpunkt
    @GetMapping("/person")
    public void saveUserByName(@RequestParam(value = "id") long id, @RequestParam(value = "firstName") String firstName) {
        return savePerson(id, firstNames);
    }
}
