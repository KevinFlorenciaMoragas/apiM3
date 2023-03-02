/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.florencia.api.Repository;

import com.florencia.api.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryOfProducts extends JpaRepository<Product, Integer> {
    
}
