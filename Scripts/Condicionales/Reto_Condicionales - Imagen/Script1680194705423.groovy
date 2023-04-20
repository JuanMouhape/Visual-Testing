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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(0)

WebUI.scrollToElement(findTestObject('Condicionales/Page_DEMOQA/button_Submit'), 10)

WebUI.click(findTestObject('Object Repository/Condicionales/Page_DEMOQA/button_Submit'))

nombre = WebUI.waitForImagePresent(findTestObject('Condicionales/Page_DEMOQA/nombre'), 3)

if (nombre == false) {
    WebUI.setText(findTestObject('Condicionales/Page_DEMOQA/input_Name_firstName'), 'Juan Cruz')

    WebUI.delay(3)
}

apellido = WebUI.waitForImagePresent(findTestObject('Condicionales/Page_DEMOQA/apellido'), 3)

if (apellido == false) {
    WebUI.setText(findTestObject('Condicionales/Page_DEMOQA/input_Name_lastName'), 'Mouhape')

    WebUI.delay(3)
}

WebUI.takeScreenshotAsCheckpoint('Practice Form')

WebUI.closeBrowser()

