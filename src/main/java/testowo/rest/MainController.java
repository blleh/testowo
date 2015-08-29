package testowo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import testowo.domain.QuestionsSuite;
import testowo.repository.QuestionsSuiteRepository;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private QuestionsSuiteRepository questionsSuiteRepository;

    @RequestMapping("/tests")
    public @ResponseBody List<QuestionsSuite> listOfTests() {
        return questionsSuiteRepository.findAll();
    }

    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    public @ResponseBody QuestionsSuite getSingleTest(@PathVariable("id") String id) {
        return questionsSuiteRepository.findOne(id);
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public @ResponseBody void addSingleTest(@RequestBody QuestionsSuite questionsSuite) {
        questionsSuiteRepository.save(questionsSuite);
    }
}
