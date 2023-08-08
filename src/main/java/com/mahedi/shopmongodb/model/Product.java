package com.mahedi.shopmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "product")
public class Product extends BaseModel {

  private String productName;
  private String productAmount;
  private long productQuantity;
  private long price;
  private String description;
}
