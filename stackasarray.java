public class MyClass {
    
    public static class Stack {
        static int  top; 
        static final int MAX = 100 ; 
        static int a[] = new int [MAX] ; 
        Stack() {
            top = -1 ; 
        }
        
        public static boolean isEmpty()
        {
            if (top < 0)
            {
                System.out.println("Stack is Empty"); 
                return true; 
            }else 
            {
                return false ; 
            }
        }
        
        public static boolean push(int ele )
        {
            if (top >= (MAX -1)   )
            {
                System.out.println("Stack Over flow"); 
                return false; 
            }else 
            {
                a[++top] = ele; 
                System.out.println(ele +  " added to the stack at position " + top ); 
                return true; 
            }
        }
        public static int pop() 
        {
            if (top < 0)
            {
                System.out.println("Stack is empty"); 
                return 0 ; 
            }else 
            {
                int ele = a[top--] ; 
                return ele ;
            }
        }
        public static int peek()
        {
            if (top < 0 )
            {
                System.out.println("the stack is empty"); 
                return 0 ; 
            }else 
            {
                int ele = a[top]; 
                return ele ; 
            }
        }
        
        public static boolean print() 
        {
            if (top < 0 ) 
            {
                System.out.println("the stack is empty" ); 
                return false; 
            }else 
            {
                for (int i = top ; i >= 0 ; i--)
                {
                    System.out.print(a[i] + " "); 
                }
                System.out.println(); 
                return true; 
            }
        }
    }
    public static void main(String args[]) {
    Stack s = new Stack(); 
    s.print(); 
    s.push(5); 
    s.print(); 
    s.push(-1); 
    s.push(8); 
    int r = s.pop(); 
    System.out.println(r) ; 
    s.print(); 
    }
}