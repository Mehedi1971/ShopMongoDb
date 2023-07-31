package com.mahedi.shopmongodb.repository;

import com.mahedi.shopmongodb.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product,Long> {
}
