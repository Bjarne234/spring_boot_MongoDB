package bj.spring.com.example.accessingdatamongodb;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    List<Person> findAll();

    Person creatPerson(Person person);

}