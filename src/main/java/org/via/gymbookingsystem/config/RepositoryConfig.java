package org.via.gymbookingsystem.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.via.gymbookingsystem.domain.Account;
import org.via.gymbookingsystem.domain.Booking;
import org.via.gymbookingsystem.domain.Gym;

@Component
public class RepositoryConfig implements RepositoryRestConfigurer{

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(
                Account.class,
                Gym.class,
                Booking.class);

        config.setReturnBodyForPutAndPost(true);
    }
}