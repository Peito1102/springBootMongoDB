package com.ejemplo.semana04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.semana04.entity.Libro;
import com.ejemplo.semana04.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{
    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libro> listAllLibros() {
        return libroRepository.findAll();
    }

    @Override
    public List<Libro> listLibrosByPageCount(int pageCount) {
        return libroRepository.findByPageCount(pageCount);
    }

    @Override
    public List<Libro> listLibrosByIsbn(String isbn) {
        return libroRepository.findByIsbn(isbn);
    }

    @Override
    public List<Libro> listLibrosByTitle(String title) {
        return libroRepository.findByTitle(title);
    }

}
