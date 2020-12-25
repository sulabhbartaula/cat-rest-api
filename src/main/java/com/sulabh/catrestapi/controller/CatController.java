package com.sulabh.catrestapi.controller;

import com.sulabh.catrestapi.entity.Cat;
import com.sulabh.catrestapi.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
public class CatController {

    private CatService catService;

    @Autowired
    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/cats")
    public ResponseEntity<List<Cat>> getAllCats(){
        List<Cat> list = catService.getCats();
        return new ResponseEntity<List<Cat>>(list, HttpStatus.OK);
    }

    @GetMapping("/cats/breed")
    public ResponseEntity<Set<String>> getCatBreeds(){
        Set<String> list = catService.getCatBreed();
        return new ResponseEntity<Set<String>>(list,HttpStatus.OK);
    }

    @GetMapping("/{id}/breed")
    public ResponseEntity<String> getBreedById(@PathVariable Long id){
        String breed = catService.getCatBreedById(id);
        return new ResponseEntity<String>(breed, HttpStatus.OK);
    }

    @GetMapping("/cats/name")
    public ResponseEntity<List<String>> getCatNames(){
        List<String> list = catService.getCatNames();
        return new ResponseEntity<List<String>>(list,HttpStatus.OK);
    }
}
