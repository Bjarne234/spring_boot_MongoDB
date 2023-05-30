package Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import bj.spring.com.example.accessingdatamongodb.Person.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findByLastName(@Param("name") String lastName);

    List<Person> findAll();

}
