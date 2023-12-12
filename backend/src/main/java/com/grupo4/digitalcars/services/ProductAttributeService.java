package com.grupo4.digitalcars.services;

import com.grupo4.digitalcars.exception.DuplicatedValueException;
import com.grupo4.digitalcars.model.ProductAttribute;

import java.util.List;
import java.util.Optional;

public interface ProductAttributeService {
    List<ProductAttribute> getAllProductAttribute();
    Optional<ProductAttribute> getProductAttributeById(Integer id);
    ProductAttribute saveProductAttribute(ProductAttribute productAttribute) throws DuplicatedValueException;
    ProductAttribute updateProductAttribute(ProductAttribute productAttribute);
    void deleteProductAttributeById(Integer id);
    Optional<ProductAttribute> getProductAttributeByIcon(String icon);
}
