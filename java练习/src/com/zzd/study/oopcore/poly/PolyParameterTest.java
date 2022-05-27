package com.zzd.study.oopcore.poly;

public class PolyParameterTest {
    public static void main(String[] args) {
        Worker worker = new Worker("Tom",3000,'男');
        Manager manager = new Manager("Lisa",4000,1000,'女');
        Worker worker2 = new Worker("Tom",3000,'男');
        Employee e = new Employee("Tom",3000,'男');
        Employee e2 = new Employee("Tom",3000,'男');

        showEmpAnnual(worker);
        showEmpAnnual(manager);
        testWork(worker);
        testWork(manager);
        System.out.println(worker2.equals(worker));
    }
    public static void showEmpAnnual(Employee e){

        System.out.println(e.getAnnualSalary());
    }
    public static void testWork(Employee e){
        if (e instanceof Manager){
            ((Manager) e).manage();
        } else if (e instanceof Worker){
            ((Worker) e).work();
        }
    }

}
