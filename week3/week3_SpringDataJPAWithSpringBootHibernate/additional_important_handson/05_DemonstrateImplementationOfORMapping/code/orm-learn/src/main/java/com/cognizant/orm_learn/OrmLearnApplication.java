package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.model.Language;
import com.cognizant.orm_learn.model.State;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.repository.LanguageRepository;
import com.cognizant.orm_learn.repository.StateRepository;
import com.cognizant.orm_learn.service.CountryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

	@Autowired
	private CountryService countryService;

	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private StateRepository stateRepository;

	@Autowired
	private LanguageRepository languageRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OrmLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		testORMapping();
	}

	private void testORMapping() {
		LOGGER.info("Start O/R Mapping");

		Country country = new Country("IN", "India");
		countryRepository.save(country);

		State state1 = new State("Karnataka", country);
		State state2 = new State("Maharashtra", country);
		stateRepository.saveAll(List.of(state1, state2));

		Language lang1 = new Language("Hindi");
		Language lang2 = new Language("English");
		languageRepository.saveAll(List.of(lang1, lang2));

		country.setLanguages(Set.of(lang1, lang2));
		countryRepository.save(country);

		LOGGER.debug("Country: {}", country);
		LOGGER.debug("States: {}", country.getStates());
		LOGGER.debug("Languages: {}", country.getLanguages());

		LOGGER.info("End O/R Mapping");
	}
}
