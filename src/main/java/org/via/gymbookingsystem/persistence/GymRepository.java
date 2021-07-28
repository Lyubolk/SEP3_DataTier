package org.via.gymbookingsystem.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.via.gymbookingsystem.domain.Gym;

public interface GymRepository extends JpaRepository<Gym, Long> {}