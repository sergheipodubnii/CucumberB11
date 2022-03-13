package stepdefinitions.webordersteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Driver;

public class HookWebOrder {
    @Before
    public void BeforeScenario(){

        System.out.println("it runs before eachScenario");
    }
    @After
    public void afterScenario(){
        Driver.tearDown();
        System.out.println("it runs after eachScenario");
    }
}
