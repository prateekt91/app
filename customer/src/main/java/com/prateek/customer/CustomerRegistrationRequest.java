package com.prateek.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
