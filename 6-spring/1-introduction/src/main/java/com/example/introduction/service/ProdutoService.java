package com.example.introduction.service;

import com.example.introduction.model.Produto;
import com.example.introduction.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return produtoRepository.findById(id);

    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletarPorId(Long id) {
        produtoRepository.deleteById(id);
    }
}
