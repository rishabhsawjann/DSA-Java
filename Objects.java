class Rishabh{
    int age;
    String name ;
    float height;

    Rishabh(int age, String name, float height){
        this.age = age;
        this.name = name;
        this.height = height;
    }
}
   class Priyanshu
   {
    int age;
    String name;
    float height;

    Priyanshu(int age, String name, float height){
        this.age = age;
        this.name = name;
        this.height = height;
    }
   }
   class Objects{
    public static void main(String args[]){
        Rishabh rishabh = new Rishabh(20, "Rishabh", 5.10f);
        Priyanshu priyanshu = new Priyanshu(20, "Priyanshu", 5.10f);
        System.out.println(rishabh.age);
        System.out.println(rishabh.name);
        System.out.println(rishabh.height);
        System.out.println(priyanshu.age);
        System.out.println(priyanshu.name);
        System.out.println(priyanshu.height);
    }
   }
   