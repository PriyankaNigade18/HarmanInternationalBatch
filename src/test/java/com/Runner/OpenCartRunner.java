package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/OpenCart.feature",
				glue="com.Stepdef",
				tags="@Login")

public class OpenCartRunner 
{

}
