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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.waitForPageLoad(30)

WebUI.maximizeWindow()

WebUI.takeScreenshotAsCheckpoint('Text Box')

existe = WebUI.waitForElementVisible(findTestObject('Condicionales/Page_DEMOQA/Texto_radio'), 3)

if (existe == true) {
    WebUI.click(findTestObject('Object Repository/Condicionales/Page_DEMOQA/label_Yes'))

    WebUI.delay(3)
} else {
    print('--------Error no esta el elemento de texto radio----------')

    WebUI.navigateToUrl('https://demoqa.com/radio-button')

    WebUI.click(findTestObject('Object Repository/Condicionales/Page_DEMOQA/label_Yes'))

    WebUI.delay(3)

    WebUI.closeBrowser()
}

