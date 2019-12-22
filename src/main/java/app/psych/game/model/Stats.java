package app.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import javax.persistence.*;
@Entity
@Table(name = "stats")
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    long id;

    @OneToOne(mappedBy = "players_Id")
    Player playerId;

    @Getter @Setter
    long score;

}
