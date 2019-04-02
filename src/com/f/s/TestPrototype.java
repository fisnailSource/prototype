package com.f.s;

import org.junit.Test;

import java.util.Date;

public class TestPrototype {
    /**
     *
     */
    @Test
    public void testProto(){
        Project p1 = new Project();
        p1.setName("项目A");
        p1.setEnd(new Date());
        p1.setStart(new Date());
        Worker w1 = new Worker();
        w1.setName("员工A");
        w1.setSex(2);
        w1.setProject(p1);
        System.out.println("复制前的w1："+w1);
        try {
            Worker w2 = (Worker) w1.clone();
            w2.setName("克隆员工A");
            w2.setSex(1);
            Project p2 = w2.getProject();
            p2.setName("项目B");
            p2.setStart(new Date());
            p2.setEnd(new Date());
            System.out.println("克隆后的员工A："+w1);
            System.out.println("克隆后的员工B："+w2);
            System.out.println("项目地址"+w1.getProject().hashCode());
            System.out.println("项目地址"+w2.getProject().hashCode());

        } catch (CloneNotSupportedException e) {
        }
    }
}
