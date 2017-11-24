package com.mq.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.mq.app.bean.ProductBean;

public interface ProductRepository extends CrudRepository<ProductBean, String> {

}
