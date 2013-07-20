package com.github.cmled.springnettytemplate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.cmled.springnettytemplate.model.User;

/**
 * Simple standalone JPA app. Will load the user inserted by the script
 * import-users.sql
 * 
 * @author Geoffroy Warin (https://github.com/geowarin)
 * 
 */
public class JpaDemo {

	private static Logger log = LoggerFactory.getLogger(JpaDemo.class);

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("persistence"); // looks for
															// persistence.xml
															// in the classpath
		EntityManager entityManager = entityManagerFactory
				.createEntityManager();

		User found = entityManager.find(User.class, 1L);
		log.info("found=" + found);
	}
}
