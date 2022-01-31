//Cousins of a given Node GFG 
// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} class GfG {
    public static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    
    public static Node point(Node root, int n)
    {
        if(root == null)
            return null;
            
        if(root.data == n)
            return root;
            
        Node l = point(root.left, n);
        if(l!=null && l.data==n)
            return l;
            
        Node r= point(root.right, n);
        return r;
        
        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            Node root = buildTree(s);
            
            Node p = point(root,n);
            
            Solution ob=new Solution();
            ArrayList<Integer> ans= ob.printCousins(root, p);
            
            for(int i=0;i<ans.size();i++)
            {
                    System.out.print(ans.get(i)+" ");
    
            }
            
            System.out.println();
            
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution
{
    public static ArrayList<Integer> printCousins(Node root, Node node_to_find)
    {
        //code here
        Queue<Node> q=new LinkedList<>();
        ArrayList<Integer> ans=new ArrayList<Integer>();
        q.add(root);
        int flag=0;
        while(!q.isEmpty() && flag==0)
        {
            int size=q.size();
            while(size>0)
            {
                Node temp=q.poll();
                if(temp.left==node_to_find || temp.right==node_to_find)
                    flag=1; //checking required node through parent so the sibling wont get added
                else
                {
                    if(temp.left!=null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                }
                size--;
            }
        }
        if(flag==1)
        {
            if(q.size()==0)
                ans.add(-1);
            while(!q.isEmpty())
            {
                ans.add(q.poll().data);
            }
            
        }
        else
            ans.add(-1);
        return ans;
    }
}
