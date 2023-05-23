package bj.spring.com.example.accessingdatamongodb;

import com.mongodb.*;
import lombok.Data;
import java.util.List;

@Service
public class PersonService {

    PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    List<Person> findAll();

    Person saveOrUpdatePerson(Person person);

    Person getAll();

}