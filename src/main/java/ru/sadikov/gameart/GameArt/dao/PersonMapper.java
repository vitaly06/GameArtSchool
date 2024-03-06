package ru.sadikov.gameart.GameArt.dao;

import org.springframework.jdbc.core.RowMapper;
import ru.sadikov.gameart.GameArt.models.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setName(resultSet.getString("name"));
        person.setNumber(resultSet.getString("number"));
        person.setStatus("no");
        return person;
    }
}
