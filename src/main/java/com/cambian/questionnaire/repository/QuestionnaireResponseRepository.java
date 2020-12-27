package com.cambian.questionnaire.repository;

import com.cambian.questionnaire.entity.QuestionnaireResponse;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionnaireResponseRepository extends MongoRepository<QuestionnaireResponse, String> {
}
