package TestRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

//import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\bhask\\eclipse-workspace\\CucumberPractice\\src\\test\\java\\Feature\\login.feature"
		,glue={"StepDefination"}
		)






public class RunnerTest {

}
