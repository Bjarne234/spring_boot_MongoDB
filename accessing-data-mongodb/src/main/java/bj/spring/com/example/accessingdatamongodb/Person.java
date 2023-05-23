package bj.spring.com.example.accessingdatamongodb;

import org.springframework.data.annotation.Id;
import lombok.*;

@Builder
@Data

public class Person {
    @Id
    public String id;

    private final String firstName;
    private final String lastName;

}
