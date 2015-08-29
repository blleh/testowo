package testowo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class QuestionsSuite {

    @Id
    private String name;
    private String author;
    List<Question> questions;
}
