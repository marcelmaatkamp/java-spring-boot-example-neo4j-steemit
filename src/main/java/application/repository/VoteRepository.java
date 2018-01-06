package application.repository;

import application.model.ExtendedAccount;
import application.model.json.Vote;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface VoteRepository extends GraphRepository<Vote> {
    Vote findByVoter(ExtendedAccount voter);
    Vote findByAuthor(ExtendedAccount author);
}