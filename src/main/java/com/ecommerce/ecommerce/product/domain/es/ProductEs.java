package com.ecommerce.ecommerce.product.domain.es;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "product")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ProductEs {

    private String id;
    private String name;
    private String code;
    private String description;
    private CompanyEs seller;//seller
    private String features;
    private CategoryEs category;
    private Boolean active;


}
