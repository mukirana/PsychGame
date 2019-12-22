package app.psych.game.controller;

import app.psych.game.model.Questions;
import app.psych.game.repository.QuestionRepository;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/{id}")
    public Questions getQuestionById(@PathVariable(value ="id") Long id) throws Exception{
        return questionRepository.findById(id).orElseThrow(()-> new Exception("Something went wrong"));
    }
}
