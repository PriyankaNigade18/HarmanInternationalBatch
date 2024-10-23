package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * one scenario : tags= "@sellPage"
 * two/multiple scenario : tags= "@sellPage or @mobilePage"
 * ignore one scenario: tags= "not @mobilePage"
 * ignore multiple scenario: tags= "not @ignore"
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",
					glue="com.Stepdef",
					tags= "not @ignore",
					publish=true)
public class AmazonRunner {

}
