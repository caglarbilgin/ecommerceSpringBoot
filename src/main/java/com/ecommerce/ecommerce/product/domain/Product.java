package com.ecommerce.ecommerce.product.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "price")
@Getter
@Setter
@EqualsAndHashCode(of = "id") //iki productin esit olup olmadigi
public class Product {

    private String id;
    private String name;
    private String code;
    private String description;
    private String companyId;//seller
    private String categoryId;
    private String features;
    private Boolean active;
    private List<ProductImage> productImage;

}
