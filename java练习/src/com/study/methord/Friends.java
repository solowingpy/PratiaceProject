package com.study.methord;

/**
 * 关于this,this可以访问本类中的其他构造方法
 * 但是必须在构造方法才能使用中并且是该方法中的第一句话
 * this还可以在普通方法中区分和成员变量重名的局部变量
 * 因为变量的调用遵循就近原则
 */
public class Friends {
    private static final Friends FRIENDS1 = new Friends(20,"王泽浩");
    private static final Friends FRIENDS2 = new Friends(20,"朱政达");
    int age;
    String name;

    public static void main(String[] args) {


        FRIENDS2.shareWealAndWoe();
    }
    public Friends(int age, String name) {
        this.age = age;
        this.name = name;
    }
    /**
     * 如果用this访问其他的构造器，则必须放在构造方法中的第一句话
     */
    public Friends() {
        this(20,"王泽浩");
    }
    /**
     * this区分成员变量和普通变量
     */
    public void shareWealAndWoe(){
        String name = "朱政达";
        int age = 20;
        System.out.println(this.name + this.age + "\n" + "共振频率:" + hashCode());
        System.out.println(name + age + "\n" + "共振频率:" + hashCode());
        System.out.println("我们会同甘共苦,永不分离,愿朱政达还能多陪王泽浩几年,愿朱政达还能再多一年在校时光,陪王泽浩在技能大赛中获得佳绩");
        System.out.println("愿王泽浩在朱政达的陪伴下,王泽浩和朱政达能够一块专升本,最后都能考上一个好的本科");
        System.out.println("愿王泽浩和朱政达本科还是好朋友,同班同学的好朋友,以后也是");
        System.out.println(FRIENDS1.name+"的个人频率"+FRIENDS1.hashCode());
        System.out.println(FRIENDS2.name+"的个人频率"+FRIENDS2.hashCode());
    }
}

