package com.rafaosnaya.service.impl;

import com.rafaosnaya.model.Category;
import com.rafaosnaya.repo.ICategoryRepo;
import com.rafaosnaya.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ICategoryService{

    @Autowired
    private ICategoryRepo repo;

    @Override
    public Category save(Category category) throws Exception {
        return repo.save(category);
    }

    @Override
    public Category update(Category category) throws Exception {
        return repo.save(category);
    }

    @Override
    public List<Category> readAll() throws Exception {
        return repo.findAll();
    }

    @Override
    public Category readById(Integer id) throws Exception {
        //return repo.findById(id).get();
        //Optional<Category> op = repo.findById(id);
        //return op.isPresent() ? op.get() : new Category();
        return repo.findById(id).orElse(new Category());
    }

    @Override
    public void delete(Integer id) throws Exception {
        repo.deleteById(id);
    }
}
