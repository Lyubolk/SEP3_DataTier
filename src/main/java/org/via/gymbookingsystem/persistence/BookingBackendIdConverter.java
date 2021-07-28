package org.via.gymbookingsystem.persistence;

import org.springframework.data.rest.webmvc.spi.BackendIdConverter;
import org.springframework.stereotype.Component;
import org.via.gymbookingsystem.domain.Booking;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class BookingBackendIdConverter implements BackendIdConverter {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	private String separator = "_";

	@Override
	public boolean supports(Class<?> delimiter) {
		return delimiter.equals(Booking.class);
	}

	@Override
	public Serializable fromRequestId(String id, Class<?> entityType) {
		String[] idParts = id.split(separator);
		return new Booking.BookingId(
				Long.parseLong(idParts[0]),
				Long.parseLong(idParts[1]),
				LocalDate.parse(idParts[2]),
				Integer.parseInt(idParts[3]));
	}

	@Override
	public String toRequestId(Serializable id, Class<?> entityType) {
		Booking.BookingId bid = (Booking.BookingId) id;
		return String.format("%d%s%d%s%s%s%d",
				bid.getAccount(),
				separator,
				bid.getGym(),
				separator,
				bid.getDate().format(formatter),
				separator,
				bid.getHour());
	}

}
