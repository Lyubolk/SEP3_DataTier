package org.via.gymbookingsystem.persistence;

import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.via.gymbookingsystem.domain.Booking;
import org.via.gymbookingsystem.rest.FullBooking;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RepositoryRestResource(excerptProjection = FullBooking.class)
public interface BookingRepository extends Repository<Booking, Booking.BookingId> {

    Booking save(Booking b);

    Optional<Booking> findById(Booking.BookingId id);

    List<Booking> findAll();

    List<Booking> findByIdAccountAndIdGym(
            Long idAccount, Long idGym);

    List<Booking> findByIdAccountAndIdGymAndIdDate(
            Long idAccount, Long idGym, @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate idDate);

    List<Booking> findByIdGymAndIdDateAndIdHour(
            Long idGym, @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate idDate, int idHour);

    int countByIdGymAndIdDateAndIdHour(
            Long idGym, @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate idDate, int idHour);
}
