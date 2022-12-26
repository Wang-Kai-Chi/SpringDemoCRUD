package com.eric.demo02;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo02ApplicationTests {
	@Autowired
	private AccountRepository accountRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testCustDataSize() {
		List<Account> accounts = new ArrayList();
		accountRepository.findAll().forEach(e->accounts.add(e));
		assert(accounts.size() == 8);
	}
}
