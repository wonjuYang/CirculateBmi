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
    public int getHeightOrThrow(Long PersonId){
        return personRepository.findById(PersonId)
                .orElseThrow(() -> new RuntimeException())
                .getHeight();
    }

    public int getWeightOrThrow(Long PersonId){
        return personRepository.findById(PersonId)
                .orElseThrow(() -> new RuntimeException())
                .getWeight();

    }
}
