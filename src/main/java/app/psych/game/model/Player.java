package app.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "players")
public class Player extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    public String getName() {
        return name;
    }

    @Getter
    @Setter
    @NotBlank
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
