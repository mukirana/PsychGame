package app.psych.game.controller;

import app.psych.game.model.ContentWriter;
import app.psych.game.repository.ContentWriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ContentWriterController {

    @Autowired
    ContentWriterRepository contentWriterRepository;

    @GetMapping("/contentWriter/{id}")
    public ContentWriter getContentWriterById(@PathVariable(value = "id") Long id) throws Exception{
        return contentWriterRepository.findById(id).orElseThrow(()-> new Exception("Something went wrong"));
    }
    @PostMapping("/contentWriter/addNewWriter")
    public ContentWriter addNewWriter(@RequestBody ContentWriter contentWriter){
        return contentWriterRepository.save(contentWriter);
    }
    @DeleteMapping("/contentWriter/{id}")
    public ResponseEntity<?> deleteWriter(@PathVariable(value ="id") Long id) throws  Exception{
        ContentWriter contentWriter = contentWriterRepository.findById(id).orElseThrow(()-> new Exception("something went wrong"));
        contentWriterRepository.delete(contentWriter);
        return ResponseEntity.ok().build();
    }
}
