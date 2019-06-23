package spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.repositories.PersonDAO;
import spring.entities.Person;

@Service
public class NameService {
	
	@Autowired
	private PersonDAO pdao;
	
	@Transactional
	public List<Person> getAllPersons() {
		return pdao.getAllPersons();
	}
	
	@Transactional
	public Person getPersonById(int id) {
		return pdao.getPersonById(id);
	}
	
	@Transactional
	public void insertPerson(String name) {
		pdao.insertPerson(name);
	}
}

