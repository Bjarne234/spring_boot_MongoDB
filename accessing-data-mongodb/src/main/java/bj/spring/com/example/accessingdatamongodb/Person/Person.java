package bj.spring.com.example.accessingdatamongodb.Person;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "Customer")
@Builder
@Data

public class Person {
    @Id
    public String id;

    private final String firstName;
    private final String lastName;

}
