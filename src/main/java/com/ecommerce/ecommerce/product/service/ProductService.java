package com.ecommerce.ecommerce.product.service;

import com.ecommerce.ecommerce.product.domain.Product;
import com.ecommerce.ecommerce.product.model.ProductResponse;
import com.ecommerce.ecommerce.product.model.ProductSaveRequest;
import com.ecommerce.ecommerce.product.repository.mongo.ProductRespository;
import com.ecommerce.ecommerce.repository.es.ProductEsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductEsRepository productEsRepository;
    private final ProductRespository productRespository;

    List<ProductResponse> getByPaging(Pageable pageable){
        // 1- ESden sorgula
        // 2- calc fieldlari isle
        // redisten ihtiyac alanları getir
        // 3- response nesnesine donustur

        return null;
    }

    ProductResponse save(ProductSaveRequest productSaveRequest){
        // 1- mongoya yaz
        // 2- elasticten(ES) guncelle
        // redisten guncellenecek varsa guncelle (stoklar tutulacak)
        // 3-  Es den cevap don
        // 4- response nesnesine donustur

        return null;
    }
}
