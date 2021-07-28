package org.via.gymbookingsystem.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
public class Booking {

    @Embeddable
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BookingId implements Serializable {
        private Long account;
        private Long gym;
        private LocalDate date;
        private int hour;
    }

    @EmbeddedId
    private BookingId id;

    @MapsId("account")
    @ManyToOne
    private Account account;

    @MapsId("gym")
    @ManyToOne
    private Gym gym;

    public Booking(Account a, Gym g, LocalDate date, int hour) {
        this.id = new BookingId(a.getId(), g.getId(), date, hour);
        this.account = a;
        this.gym = g;
    }

    public Booking() {
        this.id = new BookingId();
    }

    public LocalDate getDate() {
        return id.getDate();
    }

    public void setDate(LocalDate date) {
        id.setDate(date);
    }

    public int getHour() {
        return id.getHour();
    }

    public void setHour(int hour) {
        id.setHour(hour);
    }
}