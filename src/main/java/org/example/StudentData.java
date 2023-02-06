package org.example;
import java.util.*;
import java.util.logging.Logger;
class StudentData
{
    private  String name;
    private  int age;
    private  double gpa;
    StudentData()
    {
        this.name="";
        this.age=0;
        this.gpa=0.0;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setage(int age)
    {
        this.age=age;
    }
    public void setgpa(Double gpa)
    {
        this.gpa=gpa;
    }
    public String getname()
    {
        return this.name;
    }
    public int getage()
    {
        return this.age;
    }
    public double getgpa()
    {
        return this.gpa;
    }
}
class StudentTest
{
    public static void main(String[] args)
    {
        int choice;
        String name;
        int age;
        double gpa;
        ArrayList<StudentData> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        Logger logger=Logger.getLogger("com.api.jar");
        while(true)
        {
            logger.info("\n1)get value from user \n2)before sort display  \n3)sorting\n4) after sorting display \n5)exit");
            logger.info("Choose any one of the option in the above: ");
            choice=sc.nextInt();
            if(choice==1)
            {
                logger.info("Enter the name:");
                name=sc.next();
                logger.info("Enter the age: ");
                age=sc.nextInt();
                logger.info("Enter the gpa: ");
                gpa=sc.nextDouble();
                StudentData st=new StudentData();
                st.setname(name);
                st.setage(age);
                st.setgpa(gpa);
                list.add(st);
            }
            else if(choice==2)
            {
                for (StudentData studentData : list) {
                    logger.info(studentData.getname() + " " + studentData.getage() + " " + studentData.getgpa());
                }
            }
            else if(choice==3)
            {
                Collections.sort(list, new Comparator<StudentData>() {
                    @Override
                    public int compare(StudentData o1, StudentData o2) {
                        return (int)(o2.getgpa()-o1.getgpa());
                    }
                });
            }
            else if(choice==4)
            {
                for (StudentData studentData : list) {
                    logger.info(studentData.getname() + " " + studentData.getage() + " " + studentData.getgpa());
                }
            }
            else if(choice==5)
            {
                break;
            }
        }
    }
}
