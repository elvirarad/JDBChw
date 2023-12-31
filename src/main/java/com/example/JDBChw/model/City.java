package com.example.JDBChw.model;

import lombok.Data;

import java.sql.ResultSet;
import java.sql.SQLException;

@Data
public class City {
    private Integer city_id;
    private String city_name;

    public static City create(ResultSet resultSet) throws SQLException {
        City city = new City();
        city.setCity_id(resultSet.getInt("city_id"));
        city.setCity_name(resultSet.getString("city_name"));
        return city;
    }
}
