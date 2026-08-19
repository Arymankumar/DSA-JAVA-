
// class BinaryTreeTraversal {

//     // Node of Binary Tree
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             left = right = null;
//         }
//     }

//     // Inorder: Left -> Root -> Right
//     static void inorder(Node root) {
//         if (root == null)
//             return;

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     // Preorder: Root -> Left -> Right
//     // static void preorder(Node root) {
//     //     if (root == null)
//     //         return;

//     //     System.out.print(root.data + " ");
//     //     preorder(root.left);
//     //     preorder(root.right);
//     // }

//     // Postorder: Left -> Right -> Root
//     // static void postorder(Node root) {
//     //     if (root == null)
//     //         return;

//     //     postorder(root.left);
//     //     postorder(root.right);
//     //     System.out.print(root.data + " ");
//     // }

//     public static void main(String[] args) {

//         // Creating tree
//         Node root = new Node(1);

//         root.left = new Node(2);
//         root.right = new Node(3);

//         root.left.left = new Node(4);
//         root.left.right = new Node(5);

//         // Traversals
//         System.out.print("Inorder: ");
//         inorder(root);

//         // System.out.print("\nPreorder: ");
//         // preorder(root);

//         // System.out.print("\nPostorder: ");
//         // postorder(root);

class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        inorder(root, result);

        return result;
    }

    private void inorder(TreeNode root, List<Integer> result) {

        if (root == null) {
            return;
        }

        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }
}