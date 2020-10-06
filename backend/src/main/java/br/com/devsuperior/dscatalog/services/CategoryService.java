package br.com.devsuperior.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devsuperior.dscatalog.entities.Category;
import br.com.devsuperior.dscatalog.repositories.CategoryRepository;

// service layer

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category>findAll(){
		
		return repository.findAll();
		
	}

}