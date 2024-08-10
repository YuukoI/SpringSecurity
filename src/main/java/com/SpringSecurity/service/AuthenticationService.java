package com.SpringSecurity.service;

import com.SpringSecurity.dto.AuthenticationRequest;
import com.SpringSecurity.dto.AuthenticationResponse;

public interface AuthenticationService {

    public AuthenticationResponse login(AuthenticationRequest authenticationRequest);
}
