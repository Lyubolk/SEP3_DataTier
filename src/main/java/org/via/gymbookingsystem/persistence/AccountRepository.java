package org.via.gymbookingsystem.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.via.gymbookingsystem.domain.Account;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByEmail(String email);

    List<Account> findAccountByUsername (String username);

    List<Account> findByFirstNameAndLastName(String firstName, String lastName);
}
