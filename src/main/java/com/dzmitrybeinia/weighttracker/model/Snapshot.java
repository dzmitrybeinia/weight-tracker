package com.dzmitrybeinia.weighttracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;
import java.time.Instant;

@Document("snapshot")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Snapshot {
    @Id
    private String id;
    private Double weight;
    private Double chest;
    private Double waist;
    private Double butt;
    private Double hip;
    private Double ankle;
    private Double bicep;
    private Instant date;
}
