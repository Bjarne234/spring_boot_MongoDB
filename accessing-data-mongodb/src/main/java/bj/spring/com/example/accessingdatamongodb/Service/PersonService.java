package bj.spring.com.example.accessingdatamongodb.Service;

import java.util.List;
import org.springframework.stereotype.Service;
import bj.spring.com.example.accessingdatamongodb.Person.Person;

@Service
public interface PersonService {

    List<Person> findAll();

    Person saveOrUpdatePerson(Person person);

    Person getAll();

}