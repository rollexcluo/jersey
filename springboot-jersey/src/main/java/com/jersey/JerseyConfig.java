package com.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.jersey.controller.HelloController;
@Component
public class JerseyConfig extends ResourceConfig {
      public JerseyConfig() {
    	  this.register(HelloController.class);
      }
}
