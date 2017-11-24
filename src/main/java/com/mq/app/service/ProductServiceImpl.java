package com.mq.app.service;

import java.util.ArrayList;
import java.util.List;

import com.mq.app.bean.ProductBean;
import com.mq.app.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	//private ProductFormToProduct productFormToProduct;

	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	@Override
	public List<ProductBean> listAll() {
		List<ProductBean> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add); //fun with Java 8
        return products;
	}

	@Override
	public ProductBean getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductBean saveOrUpdate(ProductBean product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

}
