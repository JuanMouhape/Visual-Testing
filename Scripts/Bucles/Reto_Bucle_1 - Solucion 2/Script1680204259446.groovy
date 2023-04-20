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

WebUI.navigateToUrl('https://demoqa.com/text-box')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(30)

for (int i = 1; i <= 3; i++) {
    int num = ((Math.random() * 1000) as int)

    def z = ['Juan', 'Pablo', 'Rodrigo', 'Cruz']

    Random nom = new Random()

    tx_nombre = (z[nom.nextInt(z.size)])

    WebUI.setText(findTestObject('Bucles/Page_DEMOQA/Page_DEMOQA/input_Full Name_userName'), tx_nombre)

    WebUI.setText(findTestObject('Bucles/Page_DEMOQA/Page_DEMOQA/input_Email_userEmail'), tx_nombre + '@gmail.com')

    WebUI.setText(findTestObject('Bucles/Page_DEMOQA/Page_DEMOQA/textarea_Current Address_currentAddress'), 'Pasaje San Luis' + 
        num)

    WebUI.setText(findTestObject('Bucles/Page_DEMOQA/Page_DEMOQA/textarea_Permanent Address_permanentAddress'), 'Bario Terminal Casa' + 
        num)

    WebUI.scrollToElement(findTestObject('Bucles/Page_DEMOQA/button_Submit'), 3)

    WebUI.click(findTestObject('Object Repository/Bucles/Page_DEMOQA/button_Submit'))

    WebUI.scrollToElement(findTestObject('Object Repository/Bucles/Page_DEMOQA/Page_DEMOQA/input_Full Name_userName'), 3)

    WebUI.delay(3)
}

WebUI.takeScreenshotAsCheckpoint('Text Box')

WebUI.closeBrowser()

