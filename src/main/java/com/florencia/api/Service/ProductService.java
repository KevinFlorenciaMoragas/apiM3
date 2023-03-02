/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.florencia.api.Service;

import com.florencia.api.Model.Product;
import com.florencia.api.Repository.RepositoryOfProducts;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author kevinflomor
 */
@Service
public class ProductService {
    @Autowired
    
    private RepositoryOfProducts repository;
    
    public List<Product>listProducts(){
        return repository.findAll();
    }
    public void saveProduct(Product product){
        repository.save(product);
    }
    public Product obtenerProductById(Integer id){
        return repository.findById(id).get();
    }
    public void deleteProduct (Integer id){
        repository.deleteById(id);
    }
}
