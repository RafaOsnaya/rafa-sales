package com.rafaosnaya.repo;

import com.rafaosnaya.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenericRepo extends JpaRepository<Category, Integer> {

}
