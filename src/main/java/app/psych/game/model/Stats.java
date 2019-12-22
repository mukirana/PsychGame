package app.psych.game.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;
@Entity
@Table(name = "stats")
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @OneToOne(mappedBy = "players_Id")
    Player playerId;

    long score;

}
