package testowo.domain;

import lombok.Data;

import java.util.List;

@Data
public class Question {
    private String type;
    private String questionText;
    private List<String> answers;
}
