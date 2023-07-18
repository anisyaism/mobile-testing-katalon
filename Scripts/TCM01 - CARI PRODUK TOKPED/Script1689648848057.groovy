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

Mobile.startExistingApplication('com.tokopedia.tkpd')

Mobile.tap(findTestObject('Object Repository/TCM01 - CARI PRODUK TOKPED/android.widget.EditText - Cari di Tokopedia'), 0)

Mobile.tap(findTestObject('Object Repository/TCM01 - CARI PRODUK TOKPED/android.widget.EditText - Cari di Tokopedia (1)'), 
    0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('TCM01 - CARI PRODUK TOKPED/android.widget.EditText - Cari di Tokopedia (1)'), produk + '\\n', 
    0)

Mobile.tap(findTestObject('Object Repository/TCM01 - CARI PRODUK TOKPED/android.widget.TextView - Filter'), 0)

if (sort_by == 'Harga Terendah') {
    Mobile.tap(findTestObject('Object Repository/TCM01 - CARI PRODUK TOKPED/android.widget.TextView - Harga Terendah'), 
        0)
} else if (sort_by == 'Terbaru') {
    Mobile.tap(findTestObject('TCM01 - CARI PRODUK TOKPED/android.widget.TextView - Terbaru'), 0)
} else if (sort_by == 'Harga Tertinggi') {
    Mobile.tap(findTestObject('TCM01 - CARI PRODUK TOKPED/android.widget.TextView - Harga Tertinggi'), 0)
}

Mobile.swipe(267, 1015, 244, 336)

Mobile.swipe(267, 1015, 244, 336)

Mobile.swipe(267, 1015, 244, 336)

if (kondisi == 'Baru') {
    Mobile.tap(findTestObject('Object Repository/TCM01 - CARI PRODUK TOKPED/android.widget.TextView - Baru'), 0)
} else if (kondisi == 'Bekas') {
    Mobile.tap(findTestObject('Object Repository/TCM01 - CARI PRODUK TOKPED/android.widget.TextView - Bekas'), 0)
}

if (pengiriman == 'GoSend') {
    Mobile.tap(findTestObject('Object Repository/TCM01 - CARI PRODUK TOKPED/android.widget.TextView - GoSend'), 0)
} else if (pengiriman == 'SiCepat') {
    Mobile.tap(findTestObject('Object Repository/TCM01 - CARI PRODUK TOKPED/android.widget.TextView - SiCepat'), 0)
} else if (pengiriman == 'Anteraja') {
    Mobile.tap(findTestObject('Object Repository/TCM01 - CARI PRODUK TOKPED/android.widget.TextView - Anteraja'), 0)
}

Mobile.tap(findTestObject('TCM01 - CARI PRODUK TOKPED/android.widget.LinearLayout'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

