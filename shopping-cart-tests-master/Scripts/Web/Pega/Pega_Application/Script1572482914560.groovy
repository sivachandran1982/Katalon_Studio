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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pegabpmmum.cognizant.com/prweb/PRWebLDAP1/pbdorj4V2aBoI4ScEONLsEaxdEWiqDby*/!STANDARD?pzPostData=986725791')

WebUI.setText(findTestObject('Pega_Objects/input_User Name_UserIdentifier'), '174647')

WebUI.setEncryptedText(findTestObject('Pega_Objects/input_Password_Password'), 'baxVAaJ/3p2hqX3LEZVUMw==')

WebUI.click(findTestObject('Pega_Objects/span_Log In'))

WebUI.waitForPageLoad(GlobalVariable.waitPresentTimeout)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Pega_Objects/AppMenu'))

WebUI.click(findTestObject('Pega_Objects/DataLink_App'))

WebUI.click(findTestObject('Pega_Objects/Expand_Data'))







