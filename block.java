class Student 
{
	static String clgname;
	int enroll;
	static int count=0;

	static
		{
			clgname ="GANDHI";
			System.out.println("clgname:" +clgname);

        }

	{
		count++;
		enroll = count;
	}
}

class mainclass
{
	public static void main(String[] args) 
	{
		//System.out.println("clg name:" +new Student().clgname);
		
		//System.out.println("enroll number:" +new Student().enroll);
		Student s1 = new Student();
		System.out.println("enroll number:" +s1.enroll);

		Student s2 = new Student();
		System.out.println("enroll number:" +s2.enroll);


		Student s3 = new Student();
		System.out.println("enroll number:" +s3.enroll);


	}
}
