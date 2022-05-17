package DataStructures.tree.binary;

/**
 * @Author: yqy
 * @Date: 2022/03/15/14:55
 * @Description:
 */
public class HeroNode {
    private int no;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    /**
     * 前序遍历
     */
    public void perNode(){
        System.out.println(this);
        if (this.left!=null){
            this.left.perNode();
        }
        if (this.right!=null){
            this.right.perNode();
        }
    }

    /**
     * 中序遍历
     */
    public void infixNode(){
        if (this.left!=null){
            this.left.infixNode();
        }
        System.out.println(this);
        if (this.right!=null){
            this.right.infixNode();
        }
    }

    /**
     * 后序遍历
     */
    public void lastNode(){
        if (this.left!=null){
            this.left.lastNode();
        }
        if (this.right!=null){
            this.right.lastNode();
        }
        System.out.println(this);
    }

    public HeroNode perSearch(int no){
        int i=0;
        /**
         * 如果查找的就是根节点，直接返回
         */
        if (this.no==no){
            return this;
        }
        HeroNode temp=null;
        if (this.left!=null){
            temp=this.left.perSearch(no);
        }
        if (temp!=null){
            return temp;
        }
        if (this.right!=null){
            temp=this.right.perSearch(no);
        }
        return temp;
    }
    public HeroNode infixSearch(int no){
        HeroNode temp=null;
        if (this.left!=null){
            temp=this.left.infixSearch(no);
        }
        if (temp!=null){
            return temp;
        }
        if (this.no==no){
            return this;
        }
        if (this.right!=null){
            temp=this.right.infixSearch(no);
        }
        return temp;

    }
    public HeroNode lastSearch(int no){
        HeroNode temp=null;
        if (this.left!=null){
            temp=this.left.lastSearch(no);
        }
        if (temp!=null){
            return temp;
        }
        if (this.right!=null){
            temp=this.right.lastSearch(no);
        }
        if (temp!=null){
            return temp;
        }
        if (this.no==no){
            return this;
        }
        return temp;
    }

    public void delNode(int no){
        if ()
    }
























    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeft() {
        return left;
    }

    public void setLeft(HeroNode left) {
        this.left = left;
    }

    public HeroNode getRight() {
        return right;
    }

    public void setRight(HeroNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
