package org.via.gymbookingsystem.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import org.via.gymbookingsystem.domain.Booking;

import java.time.LocalDate;

@Projection(
	name = "flatBooking",
	types = { Booking.class }
)
public interface FlatBooking {

	@Value("#{target.id.account}")
	long getAccountId();

	@Value("#{target.id.gym}")
	long getGymId();

	@Value("#{target.id.date}")
	LocalDate getDate();

	@Value("#{target.id.hour}")
	long getHour();
}
