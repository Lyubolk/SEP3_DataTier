package org.via.gymbookingsystem.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.via.gymbookingsystem.domain.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByEmail(String email);

    List<Account> findByName(String name);
}


