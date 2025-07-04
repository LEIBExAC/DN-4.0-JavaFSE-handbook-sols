package com.cognizant;

import com.cognizant.model.Country;
import com.cognizant.model.State;
import com.cognizant.repository.CountryRepository;
import com.cognizant.repository.StateRepository;
import com.cognizant.service.QueryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {
    private final QueryService queryService;

    public OrmLearnApplication(QueryService queryService) {
        this.queryService = queryService;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        queryService.runQueries();
    }

    @Bean
    CommandLineRunner runner(CountryRepository countryRepository, StateRepository stateRepository) {
        return args -> {
            Country india = new Country();
            india.setCode("IN");
            india.setName("India");

            Country usa = new Country();
            usa.setCode("US");
            usa.setName("United States");

            countryRepository.saveAll(List.of(india, usa));

            State karnataka = new State();
            karnataka.setName("Karnataka");
            karnataka.setCountry(india);

            State california = new State();
            california.setName("California");
            california.setCountry(usa);

            stateRepository.saveAll(List.of(karnataka, california));
        };
    }
}

