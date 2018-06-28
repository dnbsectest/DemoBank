package com.bddinaction.serenitybank.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/transfer_funds",
        glue = "com.bddinaction.serenitybank")
public class TransferFunds {}
