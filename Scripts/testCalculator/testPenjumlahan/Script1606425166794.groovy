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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\CCA\\Downloads\\Calculator_v7.8 (271241277)_apkpure.com.apk', true)

Mobile.tap(findTestObject('numberRepo/android.widget.Button - 2'), 0)

Mobile.tap(findTestObject('operationRepo/android.widget.Button - tambah'), 0)

Mobile.tap(findTestObject('numberRepo/android.widget.Button - 8'), 0)

Mobile.verifyElementAttributeValue(findTestObject('operationRepo/android.widget.TextView'), '10', '10', 0)

Mobile.tap(findTestObject('operationRepo/android.widget.Button - samadengan'), 0)

Mobile.closeApplication()

