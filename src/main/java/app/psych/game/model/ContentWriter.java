package app.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "content_writers")
public class ContentWriter extends Employee{

    @ManyToMany
    @Getter
    @Setter
    List<Question> editedQuestions;

}
