import java.util.Scanner;

public class BuildBinarySearchTree
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

    static Node insertNode(Node root, int value)
    {
        if (root == null)
        {
            root = new Node(value);
            return root;
        }

        if (value < root.data)
        {
            root.left = insertNode(root.left, value);
        }
        else
        {
            root.right = insertNode(root.right, value);
        }

        return root;
    }

    static Node buildBinarySearchTree(int [] values)
    {
        Node root = null;

        for (int value : values)
        {
            root = insertNode(root, value);
        }

        return root;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("\nEnter no. of nodes in a binary search tree: ");
        n = sc.nextInt();

        int [] values = new int[n];

        System.out.println("Enter node values of all the nodes of the binary search tree below:");
        for (int i = 0; i < n; i++)
        {
            values[i] = sc.nextInt();
        }

        Node root = buildBinarySearchTree(values);

        System.out.println("Binary Search Tree has been successfully completed with root node address: " + root);
    }
}
