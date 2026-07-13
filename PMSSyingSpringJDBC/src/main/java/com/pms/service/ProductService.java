package com.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pms.bean.Product;
import com.pms.dao.ProductDao;

@Service				// service layer annotation by default is is productService
public class ProductService {

	
	@Autowired
	ProductDao productDao;	
	
	public String storeProduct(Product product) {
			if(product.getPrice()<0) {
				return "Product price must +ve";
			}else if(productDao.storeProduct(product)>0) {
				return "product details stored successfully";
			}else {
				return "Product not present";
			}
	}
	
	public List<Product> findAllProducts() {
		return productDao.findAllProducts();
	}
}