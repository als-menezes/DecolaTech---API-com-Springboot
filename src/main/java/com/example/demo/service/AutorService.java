package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Autor;
import com.example.demo.repository.AutorRepository;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> buscarAutores() {
        return autorRepository.findAll();
    }

    public Optional<Autor> buscarAutorPorId(Long id) {
        return autorRepository.findById(id);
    }

    public Autor salvarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public void deletarAutor(Long id) {
        autorRepository.deleteById(id);
    }

    public Autor atualizarAutor(Long id, Autor autor) {
        throw new UnsupportedOperationException("Unimplemented method 'atualizarAutor'");
    }

}
