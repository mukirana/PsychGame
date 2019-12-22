package app.psych.game.controller;

import app.psych.game.model.Stats;
import app.psych.game.repository.StatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stats")
public class StatsController {
    @Autowired
    private StatsRepository statsRepository;

    @GetMapping("/")
    public List<Stats> getStats(){
        return statsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Stats getStatsById(@PathVariable(value = "id") Long id) throws Exception{
        return statsRepository.findById(id).orElseThrow(() -> new Exception("something went wrong"));
    }
}
