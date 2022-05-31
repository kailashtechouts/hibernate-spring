package com.spring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.details.ProductDetails;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void saveProduct(ProductDetails productDetails) {

		this.hibernateTemplate.save(productDetails);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ProductDetails> productList(String productCtg) {
		return (List<ProductDetails>) this.hibernateTemplate
				.findByNamedParam("from ProductDetails where productCtg=:productCtg", "productCtg", productCtg);

	}

	@Override
	public ProductDetails getProductListById(int id) {
		return this.hibernateTemplate.get(ProductDetails.class, id);
	}
}
