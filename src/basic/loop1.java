package basic;

public class loop1 {
 public static void main(String args[])
 { 
	 // while loop:
	 
//	 int x=0;
// while(x<=10)
// {System.out.println(x);
// x++;
// }
	 
	 // do-while loop:
//	 int x=0;
//	 do 
//	 { 
//		 System.out.println(x);
//		 x++;
//	 }
//	while(x<=10);
	
	 //foreach loop:
	 
//	 int data[]= {12,13,44};
//	 int[]pp= {56,66,32};
//	 int x[]=new int[] {12,21,23,44,55};
//	 
//	 for(int a:x)
//	 System.out.println(a+" ");
//System.out.println();
//for(Integer a:x)
//	System.out.println(a+" ");
//System.out.println();
//for(Object a:x)
//	System.out.println(a+" ");
	 
     // 2D array:
	 
//	 int data[][]= {{12,33,44},{90,89,78},{34,21,33}};
//	 for(int x=0;x<3;x++)
//	 {
//		 for(int y=0;y<3;y++)
//		 {
//			 System.out.print(data[x][y]+" ");
//		 }
//		 System.out.println();
//	 }

	 // 3D Array:
	 
	 int data[][][]= {{{12,33,44},{90,89,78},{34,21,33}},
			 {{11,22,33},{90,56,77},{54,33,22}},
			 {{44,55,66},{99,66,77},{22,11,76}}};
	 
//	 System.out.println(data[0][0][0]);
//	 System.out.println(data[1][1][1]);
//	 System.out.println(data[2][2][2]);
	int size=0; 
for(int x=0;x<3;x++)
{
	for(int y=0;y<3;y++)
	{
		for(int z=0;z<3;z++)
		{
			System.out.print(data[x][y][z]+" ");
			size++; 
		}
		System.out.println();
		
	}
	System.out.println();
}
System.out.println(size);
	 }
 }

