package com.generation.lojagames.controller;

import com.generation.lojagames.model.Categoria;
import com.generation.lojagames.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "", allowedHeaders = "")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> getAll() {
        return categoriaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Categoria getById(@PathVariable Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Categoria create(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @PutMapping
    public Categoria update(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        categoriaRepository.deleteById(id);
    }
}