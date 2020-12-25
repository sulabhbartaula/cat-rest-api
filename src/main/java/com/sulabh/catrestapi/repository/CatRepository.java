package com.sulabh.catrestapi.repository;

import com.sulabh.catrestapi.entity.Cat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CatRepository extends CrudRepository<Cat,Long> {

    @Query("select c.id, c.breed from Cat c where c.id=:id")
    String findBreedById(Long id);

    @Query("select c.id, c.breed from Cat c")
    List<String> findAllBreed();

    @Query("select c.id, c.name from Cat c")
    List<String> findAllName();


}
