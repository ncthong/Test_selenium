package firsttest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
public class TestManager {
	private ListTestCase listTestCase=new ListTestCase();
	
	public void loadTestcase() {
		Gson gson=new Gson();
		
			try {
				listTestCase =gson.fromJson(new FileReader(new File("D:/KIEM THU PHAN MEM/TEST_WITH_SELENIUM-main/TEST_WITH_SELENIUM-main/hihi.json")), ListTestCase.class);
			} catch (JsonSyntaxException e) {
				// TODO Auto-generated catch block
				System.out.println("loi doc file" + e.getMessage());
			} catch (JsonIOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
	}
	
	public void writeResult(String result) {
		File file=new File("D:/KIEM THU PHAN MEM/TEST_WITH_SELENIUM-main/TEST_WITH_SELENIUM-main/ketqua.txt");
		try {
			PrintWriter printWriter=new PrintWriter(file);
			printWriter.println(result);
			printWriter.close();
		} catch (FileNotFoundException e) {
			System.out.println("loi ghi file "+ e.getMessage());
		}

		
	}
	
	
	public void startTest() {
//		System.setProperties("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32");
////		WebDriver webDriver;
//		WebElement webElement;
//		String resultString="";
//		
//		for(int i=0, length= listTestCase.getList().size();i<length;i++) {
//			try {
//				webDriver =new ChromeDriver();
//				webDriver.get("http://www.demo.guru99.com/V4/");
//				webElement=webDriver.findElement(By.name("uid"))
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
