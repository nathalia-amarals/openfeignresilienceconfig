package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.cloud.openfeign.FeignBuilderCustomizer;

//@Configuration
public class FeignClient {

//    @Bean
//    public FeignBuilderCustomizer feignBuilderCustomizer(CircuitBreakerFactory<?, ?> circuitBreakerFactory) {
//        return feignBuilder -> feignBuilder.client(new Resilience4JCircuitBreakerFeignClient(circuitBreakerFactory));
//    }
}
