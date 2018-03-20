

import org.apache.hadoop.hive.ql.exec.UDF;

public class mostmedicine_UDF extends UDF {
	
	public int evaluate(boolean medication){
	
	int count=0;
	if(medication="cabazitadel" != null)
	{
		count++;
	}
	else if(medication="cefotec" != null)
		count++;
	return count++;
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


