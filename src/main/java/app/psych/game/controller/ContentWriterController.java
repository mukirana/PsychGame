package app.psych.game.controller;

import app.psych.game.repository.ContentWriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Content")
public class ContentWriterController {

    @Autowired
    ContentWriterRepository contentWriterRepository;

}
