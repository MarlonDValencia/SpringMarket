package com.java.market.persistence;

import com.java.market.persistence.crud.ProductoCrudRepository;
import com.java.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
