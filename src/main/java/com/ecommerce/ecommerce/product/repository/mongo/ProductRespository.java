package com.ecommerce.ecommerce.product.repository.mongo;

import com.ecommerce.ecommerce.product.domain.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRespository extends ReactiveMongoRepository<Product,String> {

}
