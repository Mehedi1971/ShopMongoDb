package com.mahedi.shopmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customer")
public class Customer extends BaseModel{
//    @Id
//    private long id;
    private String customerName;
    private String email;
    private String address;
    private List<Product>products;
}
