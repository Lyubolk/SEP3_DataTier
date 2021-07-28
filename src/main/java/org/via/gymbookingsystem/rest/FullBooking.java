package org.via.gymbookingsystem.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import org.via.gymbookingsystem.domain.Account;
import org.via.gymbookingsystem.domain.Booking;
import org.via.gymbookingsystem.domain.Gym;

import java.time.LocalDate;

@Projection(
	name = "fullBooking",
	types = { Booking.class }
)
public interface FullBooking {

	@Value("#{target.account}")
	Account getAccount();

	@Value("#{target.gym}")
	Gym getGym();

	@Value("#{target.id.date}")
	LocalDate getDate();

	@Value("#{target.id.hour}")
	int getHour();
}
