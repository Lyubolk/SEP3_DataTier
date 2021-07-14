package org.via.gymbookingsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Gym {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int hourlyLimit;

    public Gym(String name, int limit) {
        this.name = name;
        this.hourlyLimit = limit;
    }
}
