package com.eric.demo02;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	private final AccountRepository accountRepository;

	public AccountController(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@GetMapping
	Iterable<Account> getAccounts() {
		return accountRepository.findAll();
	}

	@GetMapping("/{id}")
	Optional<Account> getAccountById(@PathVariable String id) {
		return accountRepository.findById(id);
	}

	@PostMapping
	Account addAccount(@RequestBody Account account) {
		return accountRepository.save(account);
	}

	@PutMapping("/{id}")
	ResponseEntity<Account> updateAccount(@PathVariable String id, @RequestBody Account account) {
		return (accountRepository.existsById(id)) ? 
				new ResponseEntity<>(accountRepository.save(account), 
						HttpStatus.OK)
				: 
				new ResponseEntity<>(accountRepository.save(account), 
						HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	void deleteAccount(@PathVariable String id) {
		accountRepository.deleteById(id);
	}
}
