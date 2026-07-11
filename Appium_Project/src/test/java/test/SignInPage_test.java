package test;

import org.testng.annotations.Test;

import common_files.BaseClass;
import pages.SignIn_page;

@Test
public class SignInPage_test extends BaseClass {
	
	public void signInAction(){
		
		senKeys(SignIn_page.email, "vijaytest@gmail.com");
		senKeys(SignIn_page.password, "Test@123");
		btnClick(SignIn_page.signIn);
	}

}
