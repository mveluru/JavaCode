package com.brite.exceptions;

public class ThrowExceptions {

	int count = 0;

	void A() throws Exception {
		try {
			count++;

			try {
				count++;

				try {
					count++;
					throw new Exception();

				}

				catch (Exception ex) {
					count++;
					throw new Exception();
				}
			}

			catch (Exception ex) {
				count++;
			}
		}

		catch (Exception ex) {
			count++;
		}

	}

	void display() {
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		ThrowExceptions obj = new ThrowExceptions();
		obj.A();
		obj.display();
	}

}
