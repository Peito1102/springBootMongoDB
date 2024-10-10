package com.ejemplo.semana04.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ejemplo.semana04.entity.Libro;

public interface LibroRepository extends MongoRepository<Libro,ObjectId> {
    @Query("{ 'pageCount' :?0 }")
    public List<Libro> findByPageCount(int pageCount);

    @Query("{ 'isbn' :?0 }")
    public List<Libro> findByIsbn(String isbn);

    @Query("{ 'title' :?0 }")
    public List<Libro> findByTitle(String title);
}
