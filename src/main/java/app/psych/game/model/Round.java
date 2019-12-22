package app.psych.game.model;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Map;

@Entity
@Table(name = "rounds")
public class Round extends Auditable {
    @ManyToOne
    @Getter
    @Setter
    @NotNull
    private Game game;

    @ManyToOne
    @Getter
    @Setter
    private Question question;

    @Getter
    @Setter
    @NotNull
    private int roundNumber;

    @ManyToMany
    @Getter
    @Setter
    private Map<Player, PlayerAnswer> playerAnswers;
}
