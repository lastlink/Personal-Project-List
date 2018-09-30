import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/Regression')

suiteProperties.put('name', 'Regression')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("/Users/mr.funk/Documents/codingprojects/vuejs/f7webpack/Katalon/Personal_Projects/Reports/Regression/20180929_231629/execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/Regression', suiteProperties, [new TestCaseBinding('Test Cases/Sub Tests/Open Web Application', 'Test Cases/Sub Tests/Open Web Application',  null), new TestCaseBinding('Test Cases/Sub Tests/View Pi Tips', 'Test Cases/Sub Tests/View Pi Tips',  null), new TestCaseBinding('Test Cases/Sub Tests/View Jenkins Tips', 'Test Cases/Sub Tests/View Jenkins Tips',  null), new TestCaseBinding('Test Cases/Sub Tests/Change Color', 'Test Cases/Sub Tests/Change Color',  null), new TestCaseBinding('Test Cases/Sub Tests/Change Theme', 'Test Cases/Sub Tests/Change Theme',  null), new TestCaseBinding('Test Cases/Sub Tests/Navigate Through lists', 'Test Cases/Sub Tests/Navigate Through lists',  null), new TestCaseBinding('Test Cases/Sub Tests/View About Page', 'Test Cases/Sub Tests/View About Page',  null), new TestCaseBinding('Test Cases/Sub Tests/Close Browser', 'Test Cases/Sub Tests/Close Browser',  null)])
