package com.generation.lojagames.controller;

import com.generation.lojagames.model.Produto;
import com.generation.lojagames.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "", allowedHeaders = "")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Produto> getById(@PathVariable Long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping
    public Produto create(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @PutMapping
    public Produto update(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }
}