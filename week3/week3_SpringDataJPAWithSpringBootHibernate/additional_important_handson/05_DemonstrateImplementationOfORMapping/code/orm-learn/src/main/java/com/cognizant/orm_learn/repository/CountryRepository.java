package com.cognizant.orm_learn.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.orm_learn.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    List<Country> findByNameContaining(String keyword);
    List<Country> findByNameStartingWith(String prefix);
    List<Country> findByNameEndingWith(String suffix);
    List<Country> findAllByOrderByNameAsc();
    List<Country> findTop3ByOrderByNameDesc();
}
