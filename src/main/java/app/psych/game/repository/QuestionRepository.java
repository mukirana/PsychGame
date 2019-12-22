package app.psych.game.repository;

import app.psych.game.model.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Questions,Long> {
}
