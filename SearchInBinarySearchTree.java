import java.util.Scanner;

public class SearchInBinarySearchTree
{
    static class Node
    {
        int data;
        Node left = null, right = null;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static boolean searchInBinarySearchTree(Node root, int target)
    {
        if (root == null)
        {
            return false;
        }

        if (target == root.data)
        {
            return true;
        }
        else if (target < root.data)
        {
            return searchInBinarySearchTree(root.left, target);
        }
        else
        {
            return searchInBinarySearchTree(root.right, target);
        }
    }

    public static void main(String[] args)
    {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right.right = new Node(14);

        Scanner sc = new Scanner(System.in);

        int target;
        System.out.print("\nEnter an element to be searched in the binary search tree: ");
        target = sc.nextInt();

        if (searchInBinarySearchTree(root, target))
        {
            System.out.println("Element found!");
        }
        else
        {
            System.out.println("Element not found!");
        }
    }
}
