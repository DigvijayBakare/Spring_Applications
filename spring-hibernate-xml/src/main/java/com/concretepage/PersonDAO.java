package com.concretepage;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.concretepage.entity.Person;

@Transactional
public class PersonDAO {
	private HibernateTemplate  hibernateTemplate;
	public PersonDAO(HibernateTemplate  hibernateTemplate) {
	  this.hibernateTemplate = hibernateTemplate;
	}
	public Person getPersonById(int pid) {
		return hibernateTemplate.get(Person.class, pid);
	}
	public List<Person> getAllPersons() {
		return hibernateTemplate.loadAll(Person.class);
	}	
	public void addPerson(Person person) {
		hibernateTemplate.save(person);
	}
	public void updatePerson(Person person) {
		Person p = getPersonById(person.getPid());
		p.setName(person.getName());
		p.setCity(person.getCity());
		hibernateTemplate.update(p);
	}
	public void deletePerson(int pid) {
		hibernateTemplate.delete(getPersonById(pid));
	}
} 
