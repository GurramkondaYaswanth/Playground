import java.util.Scanner; 
 import java.util.Stack; 
class Main { 
  
    // Return the length of longest 
    // balanced parentheses prefix. 
    static int maxbalancedprefix(String str) 
    { 
       Stack<Integer> stack = new Stack<>();

		// initialize the stack by -1
		stack.push(-1);

		// stores the length of the longest balanced parenthesis
		int len = 0;

		// iterate over characters of the String
		for (int i = 0; i < str.length(); i++)
		{
			// if current character is an opening parenthesis,
			// push its index in the stack
			if (str.charAt(i) == '(') {
				stack.push(i);
			}

			// if current character is a closing parenthesis
			else
			{
				// pop top index from the stack
				stack.pop();

				// if the stack becomes empty, push current index into the stack
				if (stack.empty()) {
					stack.push(i);
					continue;
				}

				// get length of the longest balanced parenthesis ending at the
				// current character
				int curr_len = i - stack.peek();

				// update length of longest balanced parenthesis if required
				if (len < curr_len) {
					len = curr_len;
				}
			}
		}

		return len;
    } 
  
    // Driven Program 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
     	String str = sc.nextLine(); 

        int n = str.length(); 
  
        System.out.println(maxbalancedprefix(str)); 
    } 
}