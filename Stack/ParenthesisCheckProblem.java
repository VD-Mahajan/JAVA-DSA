package Stack;

class StackP{
	int[] arr;
	int top=-1;

	StackP(int size){
		arr=new int[size];
	}

	void push(char data) {
		arr[++top]=data;	
	}

	void pop() {

	}

	boolean answer() {
		if(top==-1) {
			return true;
		}else {
			return false;
		}
	}

	boolean parenthesisChecker(String str) {
		for (int i = 0; i < arr.length; i++) {
			if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='(') {
				push(str.charAt(i));
			}
			else if(top==-1 && str.charAt(i)=='}' || str.charAt(i)==']' || str.charAt(i)==')') {
				return false;
			}else if(str.charAt(i)=='}') {
				if(top!=-1 && arr[top]!='{') {
					return false;
				}else if(top!=-1){
					top--;
				}
			}
			else if(str.charAt(i)==']') {
				if(top!=-1 && arr[top]!='[') {
					return false;
				}else if(top!=-1){
					top--;
				}
			}
			else if(str.charAt(i)==')') {
				if(top!=-1 && arr[top]!='(') {
					return false;
				}else if(top!=-1){
					top--;
				}
			}
		}

		return answer();
	}
}

public class ParenthesisCheckProblem {

	public static void main(String[] args) {
		String str = "}{{}}";
		StackP s = new StackP(str.length());
		System.out.println(s.parenthesisChecker(str));
	}
}
