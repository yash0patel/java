package StudentApplicationEx;

import java.util.Comparator;

public class RnoWiseComparator implements Comparator<StudentObj>{
	@Override
	public int compare(StudentObj s1, StudentObj s2) 
	{
        
		if(s1.getRno() > s2.getRno())              
		{                                           
			return 1;                               
		       
		}else if(s1.getRno() < s2.getRno())        
		{                                           
			return -1;                              
		}else                                       
		{                                           
			return 0;                               
		}                                           
	}

}
