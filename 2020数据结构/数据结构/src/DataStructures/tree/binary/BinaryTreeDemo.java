package DataStructures.tree.binary;

/**
 * @Author: yqy
 * @Date: 2022/03/15/14:58
 * @Description:
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        HeroNode root = new HeroNode(1, "武大郎");
        HeroNode node1 = new HeroNode(2, "宋江");
        HeroNode node2 = new HeroNode(3, "卢俊义");
        HeroNode node3 = new HeroNode(4, "林冲");
        HeroNode node4 = new HeroNode(5, "鲁智深");
        HeroNode node5 = new HeroNode(6, "武松");
        HeroNode node6 = new HeroNode(7, "李逵");
        root.setLeft(node1);
        node1.setLeft(node2);
        node2.setRight(node3);
        node1.setRight(node4);
        node4.setRight(node5);
        node4.setLeft(node6);
        binaryTree.setRoot(root);
        System.out.println("前序遍历");
        binaryTree.perShow();
        System.out.println("中序遍历");
        binaryTree.infixShow();
        System.out.println("后序遍历");
        binaryTree.lastShow();

        System.out.println("前序："+binaryTree.perSearch(7));
        System.out.println("中序："+binaryTree.infixSearch(7));
        System.out.println("后序："+binaryTree.lastSearch(7));
    }
}
