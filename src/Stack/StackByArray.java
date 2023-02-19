package Stack;

public class StackByArray {
    public int n ;
    int top;
    int arr[]=new int[n];

    StackByArray(int n,int []arr){
        this.n=n;
        this.top=-1;
        this.arr=arr;
    }

    void push(int n){
        if(top==n-1){
            System.out.println("stack overflow");
        }
        else{
            arr[++top]=n;
        }
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        else{
            return arr[top--];
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("stack empty");
            return Integer.MIN_VALUE;
        } else {
            return arr[top];
        }}


        boolean isEmpty() {
            if (top == -1)
                return true;
            else
                return false;
    }

}
