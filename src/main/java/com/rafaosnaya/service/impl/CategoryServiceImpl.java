package com.rafaosnaya.service.impl;

import com.rafaosnaya.model.Category;
import com.rafaosnaya.repo.ICategoryRepo;
import com.rafaosnaya.repo.IGenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rafaosnaya.service.ICategoryService;


@Service
public class CategoryServiceImpl extends CRUDImpl<Category, Integer> implements ICategoryService{

    @Autowired
    private ICategoryRepo repo;
    @Override
    IGenericRepo<Category, Integer> getRepo() {
        return repo;
    }
}
