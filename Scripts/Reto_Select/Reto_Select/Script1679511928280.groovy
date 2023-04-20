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

WebUI.navigateToUrl('https://testsheepnz.github.io/BasicCalculator.html')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Reto_Select/Page_Basic Calculator/number1'), '5')

WebUI.setText(findTestObject('Object Repository/Reto_Select/Page_Basic Calculator/number2'), '5')

WebUI.selectOptionByValue(findTestObject('Object Repository/Reto_Select/Page_Basic Calculator/combo'), '0', true)

WebUI.click(findTestObject('Object Repository/Reto_Select/Page_Basic Calculator/calculateButton'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Reto_Select/Page_Basic Calculator/number1'), '10')

WebUI.setText(findTestObject('Object Repository/Reto_Select/Page_Basic Calculator/number2'), '2')

WebUI.selectOptionByValue(findTestObject('Object Repository/Reto_Select/Page_Basic Calculator/combo'), '3', true)

WebUI.click(findTestObject('Object Repository/Reto_Select/Page_Basic Calculator/calculateButton'))

WebUI.takeElementScreenshot(findTestObject('Reto_Select/Page_Basic Calculator/calculateButton'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.closeBrowser()

