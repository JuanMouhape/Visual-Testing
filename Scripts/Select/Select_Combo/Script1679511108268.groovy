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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Select/Page_Facebook - Entrar o registrarse/a_Crear cuenta nueva'))

WebUI.selectOptionByLabel(findTestObject('Select/Page_Facebook - Entrar o registrarse/Combo_dia'), '9', false)

WebUI.delay(tiempo)

//String foto = WebUI.takeAreaScreenshot()
WebUI.takeScreenshot('C:\\Katalon\\Proyectos\\Proyecto_Uno\\Imagenes\\test.png')

WebUI.selectOptionByIndex(findTestObject('Select/Page_Facebook - Entrar o registrarse/Combo_dia'), 3)

WebUI.delay(tiempo)

WebUI.selectOptionByValue(findTestObject('Select/Page_Facebook - Entrar o registrarse/Combo_dia'), '9', false)

WebUI.delay(tiempo)

WebUI.closeBrowser()

