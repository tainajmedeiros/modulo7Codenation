package com.codenation.modulo07.service;


import com.codenation.modulo07.entity.Produto;
import com.codenation.modulo07.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    //Adicionar Produto
    public Produto add(Object object) {
        return produtoRepository.save((Produto) object);
    }
    //Mostrar um Produto
    public Produto get(long id) {
        return produtoRepository.findById(id);
    }
    //Atualiza dados do Produto
    public Produto update(Object object) {
        return produtoRepository.save((Produto) object);
    }
    public Optional<Produto> findById(Long id) {
        return produtoRepository.findById(id);
    }

}