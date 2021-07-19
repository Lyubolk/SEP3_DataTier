package org.via.gymbookingsystem.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.via.gymbookingsystem.domain.Booking;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Booking.BookingId> {

    List<Booking> findByAccountId(Long accountId);

    List<Booking> findByAccountUsername(String username);

    List<Booking> findByDateAndHour(LocalDate date, int hour);

    List<Booking> findByDate(LocalDate date);

    List<Booking> findByAccountIdAndDate(Long accountId, LocalDate date);
}
