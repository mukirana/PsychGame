package app.psych.game.controller;

import app.psych.game.model.PlayerAnswer;
import app.psych.game.repository.PlayerAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PlayerAnswerController {
    @Autowired
    PlayerAnswerRepository playerAnswerRepository;

    @GetMapping("/playerAnswer")
    public List<PlayerAnswer> getAllPlayerAnswer(){
        return playerAnswerRepository.findAll();
    }

    @GetMapping("/playerAnswer/{id}")
    public PlayerAnswer getPlayerAnswerById(@PathVariable(value = "id") Long id) throws Exception{
        return playerAnswerRepository.findById(id).orElseThrow(Exception::new);
    }

}
