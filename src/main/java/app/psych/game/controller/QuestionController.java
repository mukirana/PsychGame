package app.psych.game.controller;

import app.psych.game.model.GameMode;
import app.psych.game.model.Question;
import app.psych.game.repository.QuestionRepository;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.EOFException;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/dev")
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/questions")
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @GetMapping("/questions/{id}")
    public Question getAllQuestions(@PathVariable(value = "id") Long id) throws Exception {
        return questionRepository.findById(id).orElseThrow(Exception::new);
    }

    @GetMapping("/questions/gameMode")
    public Collection<Question> getAllQuestionByGameMode(@RequestParam(name="gameMode") GameMode gameMode){
        return questionRepository.findByGameMode(gameMode);
    }

    @DeleteMapping("/questions/{id}")
    public ResponseEntity<?> removeQuestionById(@PathVariable(value="id") Long id) throws Exception{
        Question question = questionRepository.findById(id).orElseThrow(EOFException::new);
        questionRepository.delete(question);
        return ResponseEntity.ok().build();
    }
}