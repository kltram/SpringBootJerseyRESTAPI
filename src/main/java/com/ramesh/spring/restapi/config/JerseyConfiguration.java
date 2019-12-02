package com.ramesh.spring.restapi.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.ramesh.spring.restapi.controller.UserController;


@Component
@ApplicationPath("/boot-jersey")
public class JerseyConfiguration extends ResourceConfig {
 public JerseyConfiguration() {
  register(UserController.class);
 }
}