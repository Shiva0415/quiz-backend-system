package com.Shiva.QuizApp.Controller;

import com.Shiva.QuizApp.model.Question;
import com.Shiva.QuizApp.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return (questionService.getAllQuestion());
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Question>> getQuestionCategory(@PathVariable String category) {
        return questionService.getQuestionByCategory(category);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question) {
        return questionService.addQuestion(question);
    }

    @DeleteMapping("/delete/{quesId}")
    public void deleteQuestion(@PathVariable int quesId) {
        questionService.deleteQuestion(quesId);
    }

}
