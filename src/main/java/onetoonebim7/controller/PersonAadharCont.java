package onetoonebim7.controller;

import onetoonebim7.dao.AadharCardDao;
import onetoonebim7.dao.PersonDao;
import onetoonebim7.dto.AadharCard;
import onetoonebim7.dto.Person;

public class PersonAadharCont {
	public static void main(String[] args) {
//		Person person = new Person();
//		person.setId(1);
//		person.setName("bhuvan");
//		person.setAddress("mysore");
//
//		AadharCard aadharCard = new AadharCard();
//		aadharCard.setId(101);
//		aadharCard.setName("bhuvnasudhan");
//		aadharCard.setAge(18);
//		aadharCard.setPerson(person);
//		
//		PersonDao dao=new PersonDao();
//		dao.savePerson(person);
//		AadharCardDao aadharCardDao=new AadharCardDao();
//		aadharCardDao.saveAadharCard(aadharCard);
//		
//		
		
//		PersonDao dao=new PersonDao();
//		dao.findPerson(1);
		
		
		AadharCardDao dao=new AadharCardDao();
		dao.deleteCard(101);
		
	}
}
