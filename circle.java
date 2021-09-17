interface ca
{
 void re(int r);

 }
 class A implements ca
 {
  public void re(int r)
  {
   
   double z=3.14*r*r;
   System.out.println("area="+z);
   }
 } 
   class circle
   {
    public static void main(String args[])
	{ 
	 A ob=new A();
	 ob.re(10);
	 }
	 }