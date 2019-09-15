package com.sumit.demo.Services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.sumit.demo.Repository.ProductRepository;
import com.sumit.demo.model.Product;

@Service
@Transactional
public class ProductService {
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public void saveMyProduct(Product product) {
		productRepository.save(product);
	}

	public List<Product> showAllProducts() 
	{	
		List<Product> products=new ArrayList<Product>();
		for(Product product:productRepository.findAll())
		{
			products.add(product); 
		}
		return products;
		
	}
	public void deleteMyProduct(int id) {
		productRepository.deleteById(id);
	}

	public Product editProduct(int id) {
		return productRepository.findById(id);
	}
}
