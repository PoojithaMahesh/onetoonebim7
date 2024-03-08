package onetoonebim7.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebim7.dto.AadharCard;
import onetoonebim7.dto.Person;

public class AadharCardDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}
	
	public void saveAadharCard(AadharCard aadharCard) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(aadharCard);
		Person dbPerson=aadharCard.getPerson();
		dbPerson.setAadharCard(aadharCard);
		entityManager.merge(dbPerson);
		entityTransaction.commit();
	}
	
	public void updateAadharCard(int id,AadharCard aadharCard) {
		EntityManager entityManager=getEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			id is present so i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			aadharCard.setId(id);
			aadharCard.setPerson(dbAadharCard.getPerson());
			entityManager.merge(aadharCard);
			entityTransaction.commit();
			
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	public void findCard(int id) {
		EntityManager entityManager=getEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			id is present so i can update the data
			System.out.println(dbAadharCard);
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	
	public void deleteCard(int id) {
		EntityManager entityManager=getEntityManager();
		AadharCard dbAadharCard=entityManager.find(AadharCard.class, id);
		if(dbAadharCard!=null) {
//			id is present so i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Person person=dbAadharCard.getPerson();
			person.setAadharCard(null);
			entityManager.remove(dbAadharCard);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}
	}
	
	
	
	
	
	
	
	
	
}
