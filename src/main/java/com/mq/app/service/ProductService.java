package com.mq.app.service;

import java.util.List;

import com.mq.app.bean.ProductBean;

public interface ProductService {
	List<ProductBean> listAll();

	ProductBean getById(String id);

	ProductBean saveOrUpdate(ProductBean product);

    void delete(String id);

  // ProductBean saveOrUpdateProductForm(ProductForm productForm);
}
