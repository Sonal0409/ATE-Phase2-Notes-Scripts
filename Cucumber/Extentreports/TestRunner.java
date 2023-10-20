package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/loginExample.feature",
				 glue= {"steps"},
				 plugin= {"html:target/Cucumberreport.html",
						 "pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"		
				},
				 //tags="@all"  // all scenarios in all feature files will run
				 //tags="@login" // only login scanerio will run
				 //tags="@regression" // scenario with regression test will run
				//  tags="@smoke"
				 //tags="@register"  // only register will run
				// tags = "@smoke or @regression" // scenarios having any of these tags will run
				// tags = "@test and @regression" // run scnearios having both the tags. but there is no test tag.. so it will not run it
				 // tags = "not @register" // run scenarios except for scenario with tag as @register
				 // you will observe hooks have not been executed as register tag scenario is not executed in above use case.
				 tags = "@register" // Now give the tag @register, you will observe before and after hook is executed
				 
		)
public class TestRunner {

}
