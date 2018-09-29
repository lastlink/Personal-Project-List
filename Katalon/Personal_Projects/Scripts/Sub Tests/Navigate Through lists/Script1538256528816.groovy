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

WebUI.click(findTestObject('detailViews/home-list/div_Home Websites'))

WebUI.click(findTestObject('detailViews/home-list/div_Home List'))

WebUI.switchToWindowTitle('Personal Projects')

WebUI.click(findTestObject('detailViews/home-list/div_Pi-hole'))

WebUI.switchToWindowTitle('Personal Projects')

WebUI.click(findTestObject('Object Repository/main-view/Page_Personal Projects/i_Default Route (404)_icon ico_1'))

WebUI.click(findTestObject('detailViews/live-list/div_Live Websites'))

WebUI.click(findTestObject('detailViews/live-list/div_Live List'))

WebUI.click(findTestObject('Object Repository/main-view/Page_Personal Projects/i_Default Route (404)_icon ico_2'))

WebUI.click(findTestObject('detailViews/github-list/div_Github Projects'))

WebUI.click(findTestObject('Object Repository/main-view/Page_Personal Projects/i_Default Route (404)_icon ico_3'))

WebUI.click(findTestObject('detailViews/game-list/div_Games'))

WebUI.click(findTestObject('detailViews/game-list/div_Game List'))

WebUI.click(findTestObject('detailViews/game-list/p_A list of games.'))

WebUI.click(findTestObject('Object Repository/main-view/Page_Personal Projects/i_Default Route (404)_icon ico_4'))

WebUI.click(findTestObject('left-navbar/i_menu'))

WebUI.click(findTestObject('detailViews/pi-tips/div_Pi Tips'))

WebUI.click(findTestObject('Object Repository/main-view/Page_Personal Projects/i_Default Route (404)_icon ico'))

WebUI.click(findTestObject('left-navbar/i_menu'))

WebUI.click(findTestObject('detailViews/jenkins-tips/div_Jenkins Tips'))

WebUI.click(findTestObject('Object Repository/main-view/Page_Personal Projects/i_Default Route (404)_icon ico'))

