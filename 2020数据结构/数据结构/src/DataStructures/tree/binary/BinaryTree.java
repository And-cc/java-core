package DataStructures.tree.binary;

/**
 * @Author: yqy
 * @Date: 2022/03/15/14:56
 * @Description:
 */
public class BinaryTree {
    private HeroNode root;

    public HeroNode getRoot() {
        return root;
    }

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    public void perShow(){
        if (root!=null){
            root.perNode();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    public void infixShow(){
        if (root!=null){
            root.infixNode();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }
    public void lastShow(){
        if (root!=null){
            root.lastNode();
        }else {
            System.out.println("二叉树为空，无法遍历");
        }
    }

    public HeroNode perSearch(int no){
        if (root!=null){
            return root.perSearch(no);
        }else {
            return null;
        }
    }
    public HeroNode infixSearch(int no){
        if (root!=null){
            return root.infixSearch(no);
        }else {
            return null;
        }
    }
    public HeroNode lastSearch(int no){
        if (root!=null){
            return root.lastSearch(no);
        }else {
            return null;
        }
    }
}
