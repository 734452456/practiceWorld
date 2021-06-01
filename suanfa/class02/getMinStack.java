package suanfa.class02;

import java.util.Stack;

/**
 * @Auther: ttliu
 * @Date: 2021/5/19 - 05 - 19 - 9:57
 * @Description: suanfa.class02
 * @version: 1.0
 */
public class getMinStack {
    public  static class myStack1{
        private Stack<Integer> stackData;
        private  Stack<Integer> stackMin;
        public myStack1(){
            this.stackData=new Stack<Integer>();
            this.stackMin=new Stack<Integer>();
        }
        public void push(int newNum){
            if(this.stackMin.isEmpty()){
                this.stackMin.push(newNum);
            }else if (newNum<this.getmin()){
                this.stackMin.push(newNum);
            }else{
                Integer newMin = this.stackMin.peek();
                this.stackMin.push(newMin);
            }
            this.stackData.push(newNum);

        }
        public int  pop(int newNum){
            if (this.stackData.isEmpty()){
                throw new RuntimeException("data stack is empty");
            }
            this.stackMin.pop();
            return this.stackData.pop();
        }
        public int getmin( ){
            if(this.stackMin.isEmpty()){
                throw  new RuntimeException("minstack is empty");
            }
            return this.stackMin.peek();

        }
    }
}
