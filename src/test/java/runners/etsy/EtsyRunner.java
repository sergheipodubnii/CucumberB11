package runners.etsy;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/com.etsy",
        glue="stepdefinitions/etsysteps",
        dryRun = false,
        tags="@regression and @smoke"
)

public class EtsyRunner {


}
