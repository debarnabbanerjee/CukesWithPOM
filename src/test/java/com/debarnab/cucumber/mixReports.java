package com.debarnab.cucumber;


import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class mixReports {

    public static void main(String[] args) {

        System.out.println("Joining Reports......");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<String>();
        jsonFiles.add("target/cucumber-parallel/1.json");
        jsonFiles.add("target/cucumber-parallel/2.json");
        jsonFiles.add("target/cucumber-parallel/3.json");
        jsonFiles.add("target/cucumber-parallel/4.json");
        jsonFiles.add("target/cucumber-parallel/5.json");

        String buildNumber = "1";
        String projectName = "cucumberProject";
        boolean runWithJenkins = true;
        boolean parallelTesting = true;

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
// optional configuration
        configuration.setParallelTesting(parallelTesting);
        configuration.setRunWithJenkins(runWithJenkins);
        configuration.setBuildNumber(buildNumber);
//// addidtional metadata presented on main page
//        configuration.addClassifications("Platform", "Windows");
//        configuration.addClassifications("Browser", "Firefox");
//        configuration.addClassifications("Branch", "release/1.0");

//// optionally add metadata presented on main page via properties file
//        List<String> classificationFiles = new ArrayList<>();
//        classificationFiles.add("properties-1.properties");
//        classificationFiles.add("properties-2.properties");
//        configuration.addClassificationFiles(classificationFiles);

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        Reportable result = reportBuilder.generateReports();
// and here validate 'result' to decide what to do
// if report has failed features, undefined steps etc
    }
}
