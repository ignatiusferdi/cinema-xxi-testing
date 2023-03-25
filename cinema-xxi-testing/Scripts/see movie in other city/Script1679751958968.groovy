import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://m.21cineplex.com/')

WebUI.click(findTestObject('Object Repository/Page_M-Tix, Cinema XXI, Cinema 21, 21 Cineplex/button_Close_navbar-toggle'))

WebUI.click(findTestObject('Object Repository/Page_M-Tix, Cinema XXI, Cinema 21, 21 Cineplex/a_Playing in - JAKARTA'))

WebUI.click(findTestObject('Object Repository/Page_M-Tix, Cinema XXI, Cinema 21, 21 Cineplex/div_YOGYAKARTA'))

WebUI.click(findTestObject('Object Repository/Page_M-Tix, Cinema XXI, Cinema 21, 21 Cineplex/div_JOGJA CITY XXI'))

WebUI.mouseOver(findTestObject('Object Repository/Page_M-Tix, Cinema XXI, Cinema 21, 21 Cineplex/div_25-03-2023Rp 45,0001230 1500 1730 2000 _9ec712'))

WebUI.delay(10)

WebUI.closeBrowser()

