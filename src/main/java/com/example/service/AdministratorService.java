package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.repository.AdministratorRepository;

@Service
public class AdministratorService {
    @Autowired
    @Transactional
    private AdministratorRepository aRepository;

    
    
}
