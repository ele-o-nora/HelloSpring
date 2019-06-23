package spring.repositories;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import spring.entities.Person;


@Repository
public class PersonImpl implements PersonDAO {
	
	@Autowired
    @Qualifier("sessionFactory")
	private SessionFactory sessionFactory;
	
	public Person getPersonById(int id) {
		return sessionFactory.getCurrentSession().get(Person.class, id);
	}
	
	public List<Person> getAllPersons() {
		return sessionFactory.getCurrentSession().createQuery("from Person", Person.class).getResultList();
	}
	
	public void insertPerson(String name) {
		Person person = new Person();
		person.setName(name);
		sessionFactory.getCurrentSession().persist(person);

	}

}
