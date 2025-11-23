package com.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

public class DataProviderInEx extends WriteInExcel {
	@Test
	public void data_provider() throws IOException {
		Write("sheet1","lisa",2,2);

	}
	
	
}
