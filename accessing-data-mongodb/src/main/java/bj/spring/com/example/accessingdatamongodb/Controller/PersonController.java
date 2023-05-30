package bj.spring.com.example.accessingdatamongodb.Controller;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import bj.spring.com.example.accessingdatamongodb.Person.Person;
import bj.spring.com.example.accessingdatamongodb.Service.PersonService;

import org.springframework.data.annotation.Id;
import java.util.List;

@Builder
@Data
@RestController
@RequestMapping("/Customer")
public class PersonController {

    @Autowired
    public PersonService personService;

    // get Entpunkt
    @GetMapping("/person/all")
    public Person getAll() {
        return personService.getAll();
    }

    // post Endpunkt
    @GetMapping("/person")
    public void saveUserByName(@RequestParam(value = "id") long id, @RequestParam(value = "firstName") String firstName) {
        return savePerson(id, firstName)
    }
}
