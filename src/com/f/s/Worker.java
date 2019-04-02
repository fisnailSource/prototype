package com.f.s;

/***
 * 每个员工负责一个一个项目
 */
public class Worker implements Cloneable {
    String name;
    Integer sex;
    Project project;

    public Worker() {
        System.out.println("调用构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", project='" + project + '\'' +
                '}';
    }

    /**
     * 重写clone方法,深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        Worker worker = (Worker) super.clone();
        worker.project = (Project) project.clone();
        return worker;
    }
}