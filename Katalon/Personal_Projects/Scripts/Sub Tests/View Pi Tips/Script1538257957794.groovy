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

WebUI.click(findTestObject('left-navbar/i_menu'))

WebUI.click(findTestObject('detailViews/pi-tips/div_Pi Tips'))

WebUI.verifyElementText(findTestObject('navigation/Nav_Title'), 'Pi/Linux Tips\n')

WebUI.verifyElementText(findTestObject('detailViews/Detail_Title'), 'Pi/Linux Tips\n')

WebUI.click(findTestObject('navigation/Back_Btn'))

not_run: WebUI.click(findTestObject('Object Repository/main-view/Page_Personal Projects/i_Default Route (404)_icon ico'))

