package com.es.eoi;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class CustomConfig  implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {
  
    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(8080);
    }
}