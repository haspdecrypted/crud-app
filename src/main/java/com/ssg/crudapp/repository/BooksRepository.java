package com.ssg.crudapp.repository;


import com.ssg.crudapp.model.Books;
import org.springframework.data.repository.CrudRepository;

//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}