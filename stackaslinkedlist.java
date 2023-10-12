public class MyClass {
    public static class StackAsLinkedList{
        
    StackNode root; 
    public static class StackNode{
        int data ; 
        StackNode next ;// point to the next node  
        StackNode(int d)
        {
            data=d; 
        }
        public static boolean isEmpty()
        {
            if (root==null)
            {
                return true ; 
            }else 
            {
                return false; 
            }
        }
        
        public static void push(int ele )
        {
            StackNode newNode = new StackNode(ele) ; 
            if (root == null)
            {
                root = newNode; 
            }else 
            {
                StackNode temp = root; 
                root= newNode; 
                newNode.next = temp; 
            }
            
            System.out.println(ele + " added to the stack "); 
        }
        
        public static int pop ()
        {
            if (root == null)
            {
                System.out.println("Stack is Empty"); 
                return 0 ; 
            }else 
            {
                int ele = root.data; 
                root = root.next; 
                System.out.println(ele + " poppped form the stack"); 
                
            }
        }
        
        public static int peek()
        {
            if (root == null)
            {
                System.out.println("Stack is Empty");
                return 0 ; 
            }else 
            {
                int ele = root.data; 
                return ele; 
            }
        }
        
    } 
    }
    public static void main(String args[]) {
    }
}