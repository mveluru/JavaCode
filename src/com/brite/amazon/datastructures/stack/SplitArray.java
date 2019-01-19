package com.brite.amazon.datastructures.stack;

import java.util.Arrays;

/*
 * Split the array and add the first part to the end | Set 2
 * int[] input = {12,10,5,6,52,,36};
 * int[] outPut = {5,6,52,36,12,10};
 */
public class SplitArray {
	int[] outArray;
	int[] stack;
	int top = -1;
	int[] inputArray;

	public SplitArray(int[] input) {
		this.inputArray = input;
		int size = input.length;
		outArray = new int[size];
		stack = new int[size];

	}

	public void push() {
		int length = this.inputArray.length;
		for (int i = 0; i < length; i++) {
			if (!isStackFull()) {
				stack[++top] = inputArray[i];
			} else {
				System.out.println("stack is full");
				break;
			}
		}
	}

	private void pop() {
		int length = this.inputArray.length;
		for (int i = 0; i < length; i++) {
			if (!isStackEmpty()) {
				outArray[i] = this.stack[top--];

			} else {
				System.out.println("Stack is empty");
				break;
			}
		}
	}

	private boolean isStackFull() {
		return (this.stack.length - 1 == this.top);
	}

	private boolean isStackEmpty() {
		return this.top == -1;
	}

	public void printOutArray() {
		for (int i : this.outArray){
			System.out.print(" "+i);
		}
	}
	
	public void splitArray(int[]input){
	int[] input1 = 	Arrays.copyOfRange(input, 2, input.length);
	int[] input0 = Arrays.copyOfRange(input, 0, 2);
	int[] output = new int[input1.length+input0.length];
	
     for (int i=0;i<input1.length;i++){
    	 output[i]=input1[i];
     }
     for (int i=0;i<input0.length;i++){
    	 output[input1.length+i]=input0[i];
     }
    for(int i:output){
    	System.out.print(" "+i);
    }
	}
public static void main(String[] args) {
	int[] input = {12,10,5,6,52,36};
	SplitArray sa = new SplitArray(input);
	sa.push();
	sa.pop();
	//sa.printOutArray();
	// didn't work out
	
	sa.splitArray(input);
}
}
