package com.surya.service;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.surya.model.Category;
import com.surya.model.Product;
import com.surya.model.ProductPaging;

public interface ProductService {
	Product addProduct(Product product);
    List<Product> getAllProducts();
	Product getProductByProductId(long productId);
	Product updateProduct(Product product, long productId);
	void deleteProduct(long productId);
	List<Product> findByCategory(Category category);
	ProductPaging findByCategory(Category category, Integer pageNo, Integer pageSize);
	ProductPaging getAllProducts(Integer pageNo, Integer pageSize);
}