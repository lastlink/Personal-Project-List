import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('detailViews/color-themes/div_Color Themes'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('navigation/Nav_Title'), 'Color Themes')

WebUI.click(findTestObject('detailViews/color-themes/a_red'))

WebUI.verifyElementAttributeValue(findTestObject('navigation/framework7root'), 'class', 'framework7-root color-theme-red', 
    20)

WebUI.click(findTestObject('detailViews/color-themes/a_green'))

WebUI.verifyElementAttributeValue(findTestObject('navigation/framework7root'), 'class', 'framework7-root color-theme-green',
	20)

WebUI.click(findTestObject('detailViews/color-themes/a_pink'))

WebUI.verifyElementAttributeValue(findTestObject('navigation/framework7root'), 'class', 'framework7-root color-theme-pink',
	20)

WebUI.click(findTestObject('detailViews/color-themes/a_yellow'))

WebUI.verifyElementAttributeValue(findTestObject('navigation/framework7root'), 'class', 'framework7-root color-theme-yellow',
	20)

WebUI.click(findTestObject('detailViews/color-themes/a_orange'))

WebUI.verifyElementAttributeValue(findTestObject('navigation/framework7root'), 'class', 'framework7-root color-theme-orange',
	20)

WebUI.click(findTestObject('detailViews/color-themes/a_red'))

WebUI.verifyElementAttributeValue(findTestObject('navigation/framework7root'), 'class', 'framework7-root color-theme-red',
	20)

WebUI.click(findTestObject('detailViews/color-themes/a_gray'))

WebUI.verifyElementAttributeValue(findTestObject('navigation/framework7root'), 'class', 'framework7-root color-theme-gray',
	20)

WebUI.click(findTestObject('detailViews/color-themes/a_black'))

WebUI.verifyElementAttributeValue(findTestObject('navigation/framework7root'), 'class', 'framework7-root color-theme-black',
	20)

WebUI.click(findTestObject('detailViews/color-themes/a_blue'))

WebUI.verifyElementAttributeValue(findTestObject('navigation/framework7root'), 'class', 'framework7-root color-theme-blue',
	20)

WebUI.callTestCase(findTestCase('Sub Tests/Navigate Back'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/main-view/Page_Personal Projects/i_Default Route (404)_icon ico'))

