package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Livro;
import com.example.demo.repository.LivroRepository;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> buscarLivros() {
        return livroRepository.findAll();
    }

    public Optional<Livro> buscarLivroPorId(Long id) {
        return livroRepository.findById(id);
    }

    public Livro salvarLivro(Livro titulo) {
        if (titulo.getId() != null && livroRepository.existsById(titulo.getId())) {
            throw new IllegalArgumentException("esse livro já existe");
        }
        return livroRepository.save(titulo);
    }

    public void deletarLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public Livro atualizarLivro(Long id, Livro livro) {
        throw new UnsupportedOperationException("Unimplemented method 'atualizarLivro'");
    }
}
