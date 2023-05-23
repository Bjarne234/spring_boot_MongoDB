package bj.spring.com.example.accessingdatamongodb;

import lombok.*;
import org.springframework.data.annotation.Id;

// Definiert die Datanbank mit attributen
@Builder
@Data
public class Customer {

    @Id
    public final String id;

    public final String firstName;
    public final String lastName;
}
