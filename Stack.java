package cseproject;
class Stack {

		int top;
		int cap;
		int[] stack;
		Stack(int size){
			cap=size;
			top=-1;
			stack=new int[cap];
		}
		void push(int value) {
			if(top==cap-1) {
				System.out.println("Stack overflow");
				return ;
			}
			stack[++top]=value;
		}
		
		int pop() {
			if(top == -1) {
				System.out.println("underflow Error");
				return -1;
			}
				int popvalue=stack[top--];
				System.out.println(popvalue+" poped value");
				return popvalue;
		}
		int peek() {
			if(top==-1) {
				System.out.println("Stack is empty");
				return -1;
			}
			return stack[top];
		}
		boolean isEmpty() {
			return top == -1;
		}
	
		
		void display() {
			if(isEmpty()) {
				System.out.println("Stack is empty..");
				return;
			}
			
			for(int i=0;i<=top;i++) {
				System.out.println(stack[i]+" ");
			}
System.out.println();
		}
		
		public static void main(String[] args) {
			Stack ss=new Stack(5);
			//ss.push(99);
			//ss.push(87);
			//ss.push(9);
			ss.push(78);
			ss.pop();
			ss.display();
System.out.println(ss.peek());		}
	}



