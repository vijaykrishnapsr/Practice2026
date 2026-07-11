package test;

import org.testng.annotations.Test;

import common_files.BaseClass;
import pages.LocationSet_page;

@Test
public class LocationSet_test extends BaseClass{

	public void setLocation() {

		senKeys(LocationSet_page.locationField, "Guam");
		btnClick(LocationSet_page.guamLocation);
		btnClick(LocationSet_page.orderNow);
		btnClick(LocationSet_page.confirmAddress);
	}
}
