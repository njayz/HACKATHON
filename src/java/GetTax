package com.vaibhav.hive;

import org.apache.hadoop.hive.ql.exec.UDF;

public class GetTax extends UDF {
	
	public int evaluate(int price){
	
	int tax=0;
	if(price>=500)
	{
		tax = price*20/100;
	}
	else
		tax = price*10/100;
	return tax;
}

public int evaluate(int price, int year){
	int gst = 0;
	if(year==2015)
	{
		gst = price*20/100;
	}else
			gst=0;
		return gst;
}
	
}


