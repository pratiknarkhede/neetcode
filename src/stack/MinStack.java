package stack;

import java.util.ArrayList;

public class MinStack {
	private static final int STACK_SIZE = 3100;
	private ArrayList<Integer> stackList = new ArrayList<Integer>();
	private ArrayList<Integer> stackOfMin = new ArrayList<Integer>();
	private int top = -1;
	private int minTop = -1;

	public MinStack() {

	}

	public void push(int val) {
		if (top < STACK_SIZE - 1) {
			top++;
			stackList.add(val);

		}
		if (minTop == -1 || stackOfMin.get(minTop) >= val) {
			minTop++;
			stackOfMin.add(val);
		}
	}

	public void pop() {
		int val=Integer.MIN_VALUE;
		if (top > -1) {
			val=stackList.get(top);
			stackList.remove(top);
			top--;
		}
		if(minTop!=-1 && stackOfMin.get(minTop)==val) {
			stackOfMin.remove(minTop);
			minTop--;
		}
	}

	public int top() {
		return stackList.get(top);

	}

	@Override
	public String toString() {
		return "current Stack" + stackList.toString() +"          " +"min_stack" + stackOfMin;
	}

	public int getMin() {
		return stackOfMin.get(minTop);

	}

}
