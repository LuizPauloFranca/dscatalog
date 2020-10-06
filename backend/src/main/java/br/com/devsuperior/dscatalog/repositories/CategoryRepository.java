package br.com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devsuperior.dscatalog.entities.Category;

// data access layer [Category = table; Long = type of id]
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
