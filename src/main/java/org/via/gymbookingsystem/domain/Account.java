package org.via.gymbookingsystem.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull private String email;

    @NonNull private String name;

    @NonNull private String password;
}
