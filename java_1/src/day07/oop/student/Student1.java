package day07.oop.student;

public class Student1 {
    private int age;
    public void setAge(int age){
        if(age>=0&&age<=256){
            this.age=age;
        }else{
            System.out.println("数据有误");
        }
    }
    public int getAge(){
        return age;
    }
}
