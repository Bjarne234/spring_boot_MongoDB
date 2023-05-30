package bj.spring.com.example.accessingdatamongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person creatPerson(Person person) {

        Person newPerson = personRepository.save(person);

        return newPerson;
    }

    @Override
    public List<Person> findAll() {

        List<Person> persons = personRepository.findAll();
        return persons;
    }

}
