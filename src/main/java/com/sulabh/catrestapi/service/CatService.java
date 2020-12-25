package com.sulabh.catrestapi.service;

import com.sulabh.catrestapi.entity.Cat;

import java.util.List;
import java.util.Set;

public interface CatService {

    List<Cat> getCats();
    Set<String> getCatBreed();
    String getCatBreedById(Long id);
    List<String> getCatNames();
}
