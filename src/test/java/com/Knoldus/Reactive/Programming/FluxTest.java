package com.Knoldus.Reactive.Programming;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FluxTest {
    @Test
    public void testFlux()
    {
        Flux<String> fluxString = Flux.just("string, Springboot", "java")
                .concatWith(Flux.error(new RuntimeException(("Exception occured by Flux"))))
                .log();
        fluxString.subscribe(System.out::println);
    }
}
