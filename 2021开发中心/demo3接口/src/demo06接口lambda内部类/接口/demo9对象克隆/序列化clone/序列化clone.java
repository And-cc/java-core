package demo06接口lambda内部类.接口.demo9对象克隆.序列化clone;

import java.io.*;

/**
 * @Author: yqy
 * @Date: 2021/06/01/12:40
 * @Description:
 */
public class 序列化clone {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Tony";

        Parent parent = new Parent();
        parent.setChild(child);

        Parent newParent = parent.clone();
        newParent.getChild().name = "Steven";

        System.out.println("parent child name:" + parent.getChild().name);
        System.out.println("new parent child name:" + newParent.getChild().name);
    }


    public static class Parent implements Serializable {

        private static final long serialVersionUID = 369285298572941L;
        private Child child;

        public void setChild(Child child) {
            this.child = child;
        }

        public Child getChild() {
            return child;
        }

        public Parent clone() {
            Parent parent = null;

            try {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(this);

                ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bais);
                parent = (Parent) ois.readObject();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return parent;

        }
    }

    public static class Child implements Serializable {

        private static final long serialVersionUID = 872390113109L;

        public String name;

        @Override
        public String toString() {
            return "name :" + name;
        }
    }
}
