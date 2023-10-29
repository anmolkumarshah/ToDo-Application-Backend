package com.anmol.ToDoApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserDetailServiceConfiguration {

    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        UserDetails admin =  User.withDefaultPasswordEncoder()
                .username("anmol@gmail.com").password("test123").authorities("ADMIN","USER").build();

        UserDetails saloni =  User.withDefaultPasswordEncoder()
                .username("saloni@gmail.com").password("test123").authorities("USER").build();

        UserDetails suman =  User.withDefaultPasswordEncoder()
                .username("suman@gmail.com").password("test123").authorities("USER").build();

        UserDetails rajesh =  User.withDefaultPasswordEncoder()
                .username("rajesh@gmail.com").password("test123").authorities("USER").build();

        return new InMemoryUserDetailsManager(admin,saloni,suman,rajesh);
    }


}
