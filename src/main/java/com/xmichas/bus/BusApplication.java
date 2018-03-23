package com.xmichas.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableAutoConfiguration
// aplikacja sama się skonfiguruje, załaduje potrzebne moduły itp. w zaleznosci co dodaliśmy w pom.xml
@ComponentScan({"com.xmichas.bus.controller","com.xmichas.bus.configuration","com.xmichas.bus.repository"}) // skanuje inne komponenty znajdujace sie w tym samym pakiecie ( w tym
//przypadku dodalismy do skanowania dwa inne pakiety
@EnableJpaRepositories("com.xmichas.bus.repository")
@EnableTransactionManagement
@EntityScan(basePackages="com.xmichas.bus.model")
public class BusApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusApplication.class, args);
	}
}
