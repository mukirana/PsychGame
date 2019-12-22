package app.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import javax.persistence.*;
@Entity
@Table(name = "stats")
public class Stats {
    @Getter
    @Setter
    private long correctAnswers = 0;
    @Getter
    @Setter
    private long gotPsychedCount = 0;
    @Getter
    @Setter
    private long psychedOthersCount = 0;
}
