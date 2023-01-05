package com.eric.demo02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoffeeController {
	private List<Coffee> coffees = new ArrayList<>();
	
	public CoffeeController() {
		coffees.addAll(List.of(new Coffee("Cereza"),
				new Coffee("Ganador"),
				new Coffee("Lareno"),
				new Coffee("Tres Pontas")));
	}
	
	@GetMapping("/coffees")
	ArrayList<Coffee> getCoffees(){
		return (ArrayList<Coffee>) coffees;
	}
}
