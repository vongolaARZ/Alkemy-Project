package com.disney.api.web.controller;

import com.disney.api.domain.dto.AuthenticationRequest;
import com.disney.api.domain.dto.AuthenticationResponse;
import com.disney.api.domain.service.UserDetailsService;
import com.disney.api.web.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtUtil jwtUtil;


    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest authenticationRequest){
      try{
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getName(),authenticationRequest.getPassword()));
        UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getName());
        String jwt = jwtUtil.generateToken(userDetails);

        return new ResponseEntity<>(new AuthenticationResponse(jwt),HttpStatus.OK);

      }catch (BadCredentialsException e) {

          return new ResponseEntity<>(HttpStatus.FORBIDDEN);

      }

    }
}
