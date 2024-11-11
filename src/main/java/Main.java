package ricorsia;

import java.util.Random;

public class ricorsia {
	
	
	public static void main(String[] args) {
		int [] a= {-4,-12,-6,8,9};
		int count=0;
		int i=0;
		double sidra_2=sidra_2(1,5);
		Multi(1,1);
		int count2=from_a_to_z("sAhElly3ADF",0);
		System.out.println(count2);
		int [] b = {1, 2, 3, 2, 5,4};
		int sum=summ(b,2);
		System.out.println(sum);
		int num=judg1(12345,15);
		System.out.println(num);
		boolean ole=ole(45678);
		System.out.println(ole);
		int count3=count(b,2,0);
		System.out.println(count3);


	}

	
	
	public static boolean rish(int x,int y) {
		if(y==1) {
			return true;
		}
		if(y==x) {
			return rish(x,y-1);
		}
		if(x%y==0) {
			return false;
		}
		return rish(x,y-1);

	}
	
	
	
	
	
//ביוטויים חשבוניים	
	
	
	public static int sidra(int n,int i,int count) {
		if(count<=0) {
			return 0;
		}
		count=count-1;
		if(i%2==0) {
			i=i+1;
			int plus=n*2;
			n=n+1;
			return plus+sidra(n,i,count);
		}
		i=i+1;
		int plus=n*n;
		n=n+1;
		return plus+sidra(n,i,count);

	}
	public static double sidra_2(int n, int count) {
	    if (count <= 0) {
	        return 0;
	    }
	    System.out.println(n);
	    System.out.println(Math.sqrt(n + 2));
	    double plus = n - Math.sqrt(n + 2);
	    n = n + 4;
	    count = count - 1;

	    return plus + sidra_2(n, count);
	}

	
	public static int cfoolot(int n1,int n2,int q) {
		if(n1>n2) {
			return 0;	
		}
		return n1 + cfoolot(n1+q,n2,q);
		}
	
	
	public static int sidra2(int n) {
		if(n==1) {
			return 0;
		}
		if(n==2||n==3) {
			return 1;
		}
		n=n-1;
			return (n-1)*(n-1)+(n-2)*(n-2)+sidra2(n);
	}
	
	
	
	   public static int sidra3(int n) {
	        if (n <= 2) {
	            return n - 1; 
	        }

	        int prev1 = sidra3(n - 1);
	        int prev2 = sidra3(n - 2);

	        int sum = prev1 * prev1 + prev2 * prev2;

	        return sum;
	    }
	
	   public static int sidra4(int n) {
	        if (n == 0) {
	            return 0;
	        }
	        int sum=sidra3(n);
	        return sum + sidra4(n - 1);
	    }
	   
	   
	   
	   
	 
	//מערכים
	   
	   
	   
	   public static int summ(int [] a,int i) {
			if(i==0) {
				return 0;
			}
			return a[i-1]+summ(a,i-1);
			
			
		}
	   
	   public static int positive(int [] a,int i) {
			if(i==0) {
			return 0;	
			}
			if(a[i-1]>0) {
				return 1+positive(a,i-1);
			}
			return positive(a,i-1);
		}
	   
	   
	   
	   public static int index(int [] a,int n,int i) {
			if(i<a.length) {
			
			if(a[i]==n) {
				return i;
			}
			return index(a,n,i+1);
		}
		return -1;



		}
	   
	   public static boolean seder(int [] b,int i) {
			if(i==b.length-1) {
				return true;
			}
			if(b[i]>=b[i+1]) {
				return false;
			}
			return seder(b,i+1);
		}
	   
	   
	   public static boolean rishoni(int[] b, int i) {
		    if (i < b.length) {
		        boolean rish = rish(b[i], b[i] - 1);
		        if (!rish) {
		            return false;  
		        }
		        return rishoni(b, i + 1); 
		    }
		    return true; 
		}
	   
	   public static boolean helper(int[] arr, int start, int end) {
		    if (start >= end) {
		        return true;
		    }

		    if (arr[start] != arr[end]) {
		        return false;
		    }

		    return helper(arr, start + 1, end - 1);
		}

		public static boolean isPalindrome(int[] arr) {
		    Random random = new Random();
		    int index1 = random.nextInt(arr.length);
		    int index2 = random.nextInt(arr.length);
		 
		    //בדקתי איזה מספר גדול יותר ואיזה קטן כדי שאוכל לדעת מאיזה אינקס להתחיל את הבדיקה
		   int start;
		   int end;
		    if(index1>index2) {
			   start=index2;
			   end=index1;
		   }
		   else {
			   end=index2;
			   start=index1;
		   }
		    
	
		    boolean f= helper(arr, start, end);
		     if(f==true) {
		    	 return true;
		     }
		     return false;
		}

//ריקורסיה על מחרוזות
	
		public static int from_a_to_z(String str,int i) {
			if(i>=str.length()) {
				return 0;
			}
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				return 1+from_a_to_z(str,i+1);
			}
			else {
				return from_a_to_z(str,i+1);
			}
		}
		
		
		public static String add(String str, int index, int count) {
	        if (index >= str.length()) {
	            return "";
	        }

	        char currentChar = str.charAt(index);

	        if (count == 3) {
	            return "*" + currentChar + add(str, index + 1, 1);
	        }

	        return currentChar + add(str, index + 1, count + 1);
	    }

		
		
		 public static String reverse(String str) {
		        return reverseHelper(str, str.length() - 1, "");
		    }
		 
		    public static String reverseHelper(String str, int index, String reversed) {
		        if (index < 0) {
		            return reversed;
		        }

		        return reverseHelper(str, index - 1, reversed + str.charAt(index));
		    }
			
		
		    
		    public static void all(char start,char end) {
		   	 if (start > end) {
		            return;
		        }
		        System.out.print(start + " ");
		        all((char) (start + 1), end);
		   }
		    
		    
		    public static void div(int n,int i) {
		    	if(i<1) {
		    		return;
		    	}
		    	if(n%i==0) {
		    		System.out.println(i);
		    	}
		    	i=i-1;
		    	  div(n,i);
		    }
		    
		    
		    public static void zoogi(int n) {
		    	if(n<=0) {
		    		return;
		    	}
		    	if((n%10)%2==0) {
		    		System.out.print(n%10);

		    	}
		    	zoogi(n/10);
		    }
		    
		    public static void Multi(int row, int col) {
		        if (row > 10) {
		            return; 
		        }
		        if (col > 10) {
		            System.out.println();
		            Multi(row + 1, 1); 
		            return;
		        }
		        System.out.printf("%4d", row * col); 
		        //בדקתי איך לעשות רווחים קבועים כדי שהתצוגה תהיה טובה יותר
		        Multi(row, col + 1); 
		    }

		   
		   
		   /// חזרה לביטויים חשבוניים 
		    
		    public static void sidra5(int first,int q,int count) {
		    	if(count<=0) {
		    		return;
		    	}
		    	count=count-1;
		    	System.out.println(first);
		    	sidra5(first+q,q,count);
		    }
		    
		    public static void sidra6(int first,int q,int count) {
		    	if(count<=0) {
		    		return;
		    	}
		    	count=count-1;
		    	first=first+q;
		    	System.out.println(first);
		    	q=q+1;
		    	sidra6(first,q,count);

		    } 
		    
		    
		    
		    public static void sidra7(int first,int q,int count) {
		    	if(count%2==0) {
		    		sidra7_help(first,q,count,true);
		    	}
		    	else {
		    	sidra7_help(first,q,count,false);
		    	}
		    }
		    public static void sidra7_help(int first,int q,int count,boolean c_zoogi) {
		    	if(count<=0) {
		    		return;
		    	}
		    	first=first+q;
		    	System.out.println(first);
		    	if(c_zoogi==true) {
		    		if(count%2==0) {
		    			q=-1;
		    		}
		    		else {
		    			q=2;
		    		}	
		    	}
		    	else {
		    		if(count%2==0) {
		    			q=-1;
		    		}
		    		else {
		    			q=2;
		    		}
		    		
		    	}
		    	count=count-1;
		    	sidra7_help(first,q,count,c_zoogi);


		    }
		    
		 //מערכים   
		    
		    public static void zogi(int [] a, int i) {
		    	if(i>=a.length) {
		    		return;
		    	}
		    System.out.println(a[i]);

		     zogi(a,i+2);

		    }
		    
		    
		    public static void big(int [] a,int i) {
		    	if(i>=a.length-1) {
		    		return;
		    	}
		    	if(a[i]<a[i+1]) {
		    		System.out.print(a[i]);
		    	}
		    	big(a,i+1);
		    }
		    
		    
		    
		    // ספרת ביקורת
		    public static int judg1(int n,int sum) {
		    	if(sum<10) {
		    		return sum;
		    	}
		     sum=judg2(n);
		    return judg1(sum, sum);
		    	
		    	
		    	
		    }
		    public static int judg2(int n) {
		    	if(n<=0) {
		    		return 0;
		    	}
		    	
		    	return (n%10) +judg2 (n/10);

		    	}
		    
		    
		    
		  
		    
public static boolean ole(int n) {
    if (n < 10) {
        return true;
    }

    int last = n % 10;
    int prev = (n / 10) % 10;

    if (last < prev) {
        return false;
    }

    return ole(n / 10);
}


public static int count(int [] a, int n,int i) {
	if(i>=a.length) {
		return 0;
	}
	if(a[i]==n) {
		return 1+count(a,n,i+1);
	}
	return count(a,n,i+1);
}
}

		    
		    
		    
		    
		    
		    
		    

