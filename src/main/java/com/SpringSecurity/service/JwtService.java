package com.SpringSecurity.service;

import com.SpringSecurity.entity.User;

import java.util.Map;

public interface JwtService {

    public String generateToken(User user, Map<String, Object> extraClaims);

    String extractUsername(String jwtToken);
}
