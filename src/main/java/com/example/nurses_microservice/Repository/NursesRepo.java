package com.example.nurses_microservice.Repository;

import com.example.nurses_microservice.Model.NursesModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NursesRepo extends MongoRepository<NursesModel, Integer> {
}

