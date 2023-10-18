package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        // feature we use the provie the path  of all the feature files
        features  ="src/test/resources/features/",
        // glue is where we find implementation of gherkin steps
        // we provide the path package where we defined all the step deference.
        glue="steps"

)
public class RunnerClass {


}
