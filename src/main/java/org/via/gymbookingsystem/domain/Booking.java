package org.via.gymbookingsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(Booking.BookingId.class)
public class Booking {

    @AllArgsConstructor
    public static class BookingId implements Serializable {
        private Long account;
        private Long gym;
        private int hour;
        private LocalDate date;
    }

    @Id
    @ManyToOne
    private Account account;

    @Id
    @ManyToOne
    private Gym gym;

    @Id
    private int hour;

    @Id
    private LocalDate date;
}
