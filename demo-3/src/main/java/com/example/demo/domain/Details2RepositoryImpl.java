package com.example.demo.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.beans.Details2;

/**
 * Created by Shubham on 09/12/18.
 */
@Repository
@Transactional(readOnly = true)


public class Details2RepositoryImpl implements Details2RepositoryCustom {
	
	  @PersistenceContext
	    EntityManager entityManager;
	    @Override
	    public List<Details2> getFirstNamesLike(String firstName) {
	        Query query = entityManager.createNativeQuery("SELECT * FROM details2 " +
	                "WHERE name LIKE ?", Details2.class);
	        query.setParameter(1, firstName + "%");
	       
	        return query.getResultList();

}
}