package app.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Questions extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    long id;

    @Getter @Setter
    String question;

    @Getter @Setter
    String answer;
}
