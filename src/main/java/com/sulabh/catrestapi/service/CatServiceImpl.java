package com.sulabh.catrestapi.service;

import com.sulabh.catrestapi.entity.Cat;
import com.sulabh.catrestapi.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CatServiceImpl implements CatService {

    CatRepository catRepository;

    @Autowired
    public CatServiceImpl(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @Override
    public List<Cat> getCats() {
        return (List<Cat>) catRepository.findAll();
    }

    @Override
    public Set<String> getCatBreed() {
        List<String> list = catRepository.findAllBreed();
        Set<String> set = Set.copyOf(list);
        return set;
    }

    @Override
    public String getCatBreedById(Long id) {
        //return catRepository.findBreedById(id);

        Optional<String> optionalBreed = Optional.ofNullable(catRepository.findBreedById(id));
        return optionalBreed.orElseThrow(CatNotFoundException::new);
    }

    @Override
    public List<String> getCatNames() {
        return catRepository.findAllName();
    }
}
