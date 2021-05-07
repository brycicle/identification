package com.exercise.auth.service;

import com.exercise.auth.dto.IdentificationRequest;
import com.exercise.auth.dto.IdentificationResponse;
import com.exercise.auth.model.Identification;

import java.util.List;

public interface IdentificationService {
    IdentificationResponse save(IdentificationRequest request);

    IdentificationResponse update(String id, IdentificationRequest request);

    void delete(String id);

    IdentificationResponse findById(String id);

    List<Identification> findAll();
}
