package com.sumit.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.sumit.demo.model.Product;
import com.sumit.demo.model.User;

public interface ProductRepository extends CrudRepository<Product, Integer> 
{
	public Product findById(int id); 
}
