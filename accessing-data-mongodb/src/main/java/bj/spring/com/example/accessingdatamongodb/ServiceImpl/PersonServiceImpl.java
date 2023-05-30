package bj.spring.com.example.accessingdatamongodb.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.PersonRepository;
import bj.spring.com.example.accessingdatamongodb.Person.Person;

@Service
public interface PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {

        List<Person> persons = personRepository.findAll();

        return toDos;
    }
}
