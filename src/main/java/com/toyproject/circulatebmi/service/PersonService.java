package com.toyproject.circulatebmi.service;

import com.toyproject.circulatebmi.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    @Transactional
    public int getHeightOrThrow(Long personId){
        return personRepository.findById(personId)
                .orElseThrow(() -> new IllegalArgumentException())
                .getHeight();
    }

    public int getWeightOrThrow(Long personId){
        return personRepository.findById(personId)
                .orElseThrow(() -> new IllegalArgumentException())
                .getWeight();

    }
}
