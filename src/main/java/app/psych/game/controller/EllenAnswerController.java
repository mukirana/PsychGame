package app.psych.game.controller;

import app.psych.game.model.EllenAnswer;
import app.psych.game.repository.EllenAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EllenAnswerController {
    @Autowired
    EllenAnswerRepository ellenAnswerRepository;

    @GetMapping("/ellenAnswer")
    public List<EllenAnswer> getAllEllenAnswer(){
        return ellenAnswerRepository.findAll();
    }

    @GetMapping("/ellenAnswer/{id}")
    public EllenAnswer getEllenAnswerById(@PathVariable( value = "id") Long id) throws Exception{
        return ellenAnswerRepository.findById(id).orElseThrow(Exception::new);
    }
}
