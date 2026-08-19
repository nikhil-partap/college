public class Main {
    Number arr[] ;
    int top;

    Main(){
        top = -1;
        arr = new Number[5];
    }

    void push(int data) throws Exception{
        if(top != 4 ){
            top++;
            this.arr[top] = data;

        }else{
            throw new Exception("stack overflow");
        }
    }
    void pop() throws Exception{
        if(top == -1){
            throw new Exception("stack underflow");
        }
        top --;
    }


    public static void main(String[] args) throws Exception {
        Main stack = new Main();
        Main s2 = new Main();

        stack.push(10);
        s2.push(34.34);
        
        stack.pop();
    }
    
}
