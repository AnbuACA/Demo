package com.example.demo.common;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator {

	private static final Random random = new Random();
	private static final Long MOD_OF = 100000000000000L;
	private static final Long ADD_WITH = 5200000000000000L;

	public static Long getRandomNumber_16() {
		return (random.nextLong() % MOD_OF) + ADD_WITH;
	}

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		return getRandomNumber_16();
	}

}
