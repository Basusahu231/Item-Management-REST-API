package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Item;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/items")
public class ItemController {

	List<Item> itemList = new ArrayList<>();

// Add new  Item
	@PostMapping
	public Item createItem(@Valid @RequestBody Item item) {
		itemList.add(item);
		return item;
	}

	// Get Item By Id
	@GetMapping("/{id}")
	public Item getById(@PathVariable("id") Long id) {

		for (Item item : itemList) {
			if (item.getId().equals(id)) {
				return item;
			}
		}

		throw new RuntimeException("Item not found with id: " + id);
	}

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<Object> RuntimeException(RuntimeException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
	}
}
