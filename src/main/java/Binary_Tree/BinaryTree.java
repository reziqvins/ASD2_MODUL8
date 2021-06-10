package Binary_Tree;
public class BinaryTree {
    TreeNode root;
    
    public boolean isEmpty(){
        return (root == null);
    }
    public void insert(TreeNode input){
        if (isEmpty()){
            root = input;
        } else {
            TreeNode current = root;
            TreeNode parent = null;
            boolean diKiri = true;
                    while (current != null){
                    parent = current;
                    
                    if (current.data < input.data){
                        current = current.right;
                        diKiri = false;
                    }else if (current.data > input.data){
                     current = current.left;
                    diKiri = true;
                    }
                    else{
                    System.out.println("data "+ input.data+"sudah ada");
                    }
                    break;
                    }
                    if (diKiri){
                        parent.left = input;
                    }else {
                        parent.right = input;
                    }
            }
        }
    public void preOrder(){
        preOrder(root);
    }
    public void inOrder(){
        inOrder(root);
    }
    public void postOrder(){
        postOrder(root);
    }
    public void preOrder(TreeNode akar){
        if(akar !=null){
            System.out.print(akar.data+" ");
            preOrder (akar.left);
            preOrder (akar.right);
        }
        }
    public void inOrder(TreeNode akar){
        if(akar !=null){
            inOrder (akar.left);
            System.out.print(akar.data+" ");
            inOrder (akar.right);
    }
    }
    public void postOrder(TreeNode akar){
        if(akar !=null){
            postOrder (akar.left);
            postOrder (akar.right);
            System.out.print(akar.data+" ");
            
}
    }
    public TreeNode search(int key){
        TreeNode node = null;
        TreeNode current = root;
        while (current != null){
            if (current.data == key){
                return node;
            } else {
                if (current.data < key){
                    current = current.right;
                } else {
                    current = current.left;
                }
            }
        }
        return node;
    }  
}    