package TestSuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
@Suite
@SelectClasses({SuiteTest1.class,SuiteTest2.class})
public class Main_TestSuite {
	
}