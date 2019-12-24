package app.psych.game.repository;

import app.psych.game.model.GameMode;
import app.psych.game.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface QuestionRepository extends JpaRepository<Question,Long> {
    Collection<Question> findByGameMode(GameMode gamemode);
}
