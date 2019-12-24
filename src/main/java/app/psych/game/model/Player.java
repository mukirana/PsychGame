package app.psych.game.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "players")
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Player extends Auditable {

    private String name;

    private String psychFaceURL;

    private String picURL;

    @OneToOne
    private Stats stats;

    @ManyToMany(mappedBy = "players")
    private List<Game> games;
}
