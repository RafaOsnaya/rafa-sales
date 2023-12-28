package com.rafaosnaya.controller;

import com.rafaosnaya.dto.CategoryDTO;
import com.rafaosnaya.exception.ModelNotFoundException;
import com.rafaosnaya.model.Category;
import com.rafaosnaya.service.ICategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private ICategoryService service;

    @Autowired
    private ModelMapper modelMapper;

/*    @GetMapping
    public List<Category> readAll() throws Exception {
        return service.readAll();
    }*/

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> readAll() throws Exception {

        //ModelMapper modelMapper = new ModelMapper();

        List<CategoryDTO> list = service.readAll().stream().map(cat -> modelMapper.map(cat, CategoryDTO.class)).collect(Collectors.toList());

//        List<CategoryDTO> list = service.readAll().stream().map(cat -> {
//            CategoryDTO categoryDTO = new CategoryDTO();
//            categoryDTO.setId(cat.getIdCategory());
//            categoryDTO.setNameCategory(cat.getNameCategory());
//            categoryDTO.setDescriptionCategory(cat.getDescriptionCategory());
//            categoryDTO.setEnabledCategory(cat.getEnabledCategory());
//            return categoryDTO;
//        }).collect(Collectors.toList());

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO>  readById(@PathVariable("id") Integer id) throws Exception {
        CategoryDTO obj = modelMapper.map(service.readById(id), CategoryDTO.class) ;
        if (obj == null){
            throw new ModelNotFoundException("ID not found: " + id);
        }
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Category> save(@RequestBody Category category) throws Exception {
        Category obj = service.save(category);
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Category> update(@RequestBody Category category) throws Exception {
        Category obj = service.update(category);
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    //Put mandando el id en la url
    /*@PutMapping("/{id}")
    public Category update(@PathVariable("id") Integer id, @RequestBody Category category) throws Exception {
        category.setIdCategory(id);
        return service.update(category);
    }*/

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) throws Exception {
        Category obj = service.readById(id);
        if (obj == null){
            throw new ModelNotFoundException("ID not found: " + id);}
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
