package com.zzd.study.oopcore.poly;

public class OverrideEqualsPractice {
    @Override
    public boolean equals(Object obj) {
        //首先判断当前传进的对象是否是同一个对象,this表示当前对象
        if (this == obj) {
            return true;
        }
        //再判断当前传进的对象是否是一个Employee对象,只有是Employee对象才能向下转型
        if (obj instanceof Employee) {
            //正确的向下转型来取值
            Employee e = (Employee) obj;
            return ((Employee) obj).getName().equals(e.getName()) && ((Employee) obj).getSalary() == e.getSalary() && ((Employee) obj).getGender() == e.getGender();
        } else {
            return false;
        }
    }
}
