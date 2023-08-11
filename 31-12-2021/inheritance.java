class inheritance{
	public static void main(String args[]){
		Student s1 = new Student("ABC","31-12-2003",'m',420230,"B.Tech.",'B');
		Student s2 = new Student("AC","13-12-2003",'m',420230,"B.Tech.",'A');
		s1.display();
		s2.display();
	}
}

class Person{
    String name;
    String dob;
    char gen;

    public void display(){
        System.out.println(name);
        System.out.println(dob);
    }
    public int age(){
        String a="";
        for (int i=6; i<dob.length(); i++){
            a=a+dob.charAt(i);
        }
        int age=Integer.parseInt(a);
        return age;
    }
    Person(String n, String d, char g){			//parameterized constructor
        name=n;
        dob=d;
        gen=Character.toUpperCase(g);			//char lowercase to uppercase
    }
}
class Student extends Person{			//inheritance/
    int roll;
    String course;
    char sec;
    Student(String n, String d, char g, int r, String course, char sec){  
        super(n,d,g);
        roll=r;
        this.course=course;
        this.sec=sec;
    }
    int age=age();
    public void display(){							/*method overriding*/
        System.out.println(name);
        System.out.println(dob);
        System.out.println(age);
        System.out.println(gen);
        System.out.println(roll);
        System.out.println(course);
        System.out.println(sec);
        
    }
}
