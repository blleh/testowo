package testowo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import testowo.domain.QuestionsSuite;

public interface QuestionsSuiteRepository extends MongoRepository<QuestionsSuite, String> {

}
