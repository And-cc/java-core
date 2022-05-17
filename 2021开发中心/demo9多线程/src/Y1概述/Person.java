package Y1概述;

public class Person {
    private String name;
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println(name+"--->"+(i+1));
        }
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
