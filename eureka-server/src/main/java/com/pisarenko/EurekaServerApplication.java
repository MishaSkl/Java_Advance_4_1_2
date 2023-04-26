package com.pisarenko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *  Содежрит реестр служб и REST API, которые можно использовать для регистрации службы,
 *  отмены регистрации службы и определения местоположения других служб.
 */
@SpringBootApplication
@EnableEurekaServer
@EnableFeignClients
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
