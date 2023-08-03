package com.example.JDBChw.dao;

import com.example.JDBChw.model.City;

public interface CityDAO {
    City findById(Integer id);

    void create(City city);

    void deleteById(Integer id);
}
