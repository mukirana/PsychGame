package app.psych.game.controller;

import app.psych.game.model.Round;
import app.psych.game.repository.RoundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoundController {
    @Autowired
    RoundRepository roundRepository;

    @GetMapping("/rounds")
    public List<Round> getRounds(){
        return roundRepository.findAll();
    }

    @GetMapping("/rounds/{id}")
    public Round getRoundById(@PathVariable(value = "id") Long id) throws Exception{
        return roundRepository.findById(id).orElseThrow(Exception::new);
    }
}
