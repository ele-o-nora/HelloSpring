package spring.repositories;

import java.util.List;

import spring.entities.Person;

public interface PersonDAO {
	public Person getPersonById(int id);
	public List<Person> getAllPersons();
	public void insertPerson(String name);
}
