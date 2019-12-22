package app.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contentWriter")
public class ContentWriter extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    Long id;

    @Getter @Setter
    String EmailId;

    @Getter @Setter
    String name;

}
