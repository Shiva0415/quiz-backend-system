package com.Shiva.QuizApp.Repository;

import com.Shiva.QuizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// 1->type of object working with, 2->primary key type
public interface QuestionRepo extends JpaRepository<Question, Integer> {

    // category is the part of table so data jpa is smart enough to understand that
    List<Question> findByCategory(String category);
}
