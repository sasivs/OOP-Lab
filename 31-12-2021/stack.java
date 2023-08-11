import stacks.*;
public class stack implements stack_interface{
    int [] arr = new int[size];
    int top;
    stack(){
        top=-1;
    }
    public void push(int key){
        if(top==size-1){return;}
        top=top+1;
        arr[top]=key;
        return;
    }

    public int pop(){
        if(top==-1){return -1;}
        top=top-1;
        return arr[top+1];
    }

    public int peek(){
        if(top==-1){return -1;}
        return arr[top];
    }
}
