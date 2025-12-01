package com.example.Alert_City.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Alert_City.model.CategoryModel;
import com.example.Alert_City.repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<CategoryModel> findAll() {
        return categoryRepository.findAll();
    }

    public Optional<CategoryModel> findById(Long id) {
        return categoryRepository.findById(id);
    }
}
