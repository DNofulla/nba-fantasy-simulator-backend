package com.PenguinGangT2.Backend.controller;

import java.util.Collection;

import com.PenguinGangT2.Backend.models.Tournaments;
import com.PenguinGangT2.Backend.repository.TournamentsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tournaments")
public class TournamentsController {
    @Autowired
    private TournamentsRepository tournamentsRepo;
    
    @GetMapping
    public Collection<Tournaments> getAll(){
        return tournamentsRepo.findAll();
    }
    
}