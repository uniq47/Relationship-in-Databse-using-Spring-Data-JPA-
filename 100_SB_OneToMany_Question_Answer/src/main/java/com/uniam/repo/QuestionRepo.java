package com.uniam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uniam.entity.Question;

@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

	
}
