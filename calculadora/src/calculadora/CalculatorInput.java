package calculadora;
import java.io.*;

class CalculatorInput{
	BufferedReader stream;
	CalculatorEngine engine;
	
	CalculatorInput (CalculatorEngine e){
		InputStreamReader input = new InputStreamReader(System.in);
		stream = new BufferedReader(input);
		engine = e;
	}
	
	int run(String op) throws Exception {
		for(;;){
			
			//System.out.print("[" + engine.display() + "]");
			//String m = stream.readLine();
			System.out.println(op);
			if (op.length() == 0) {
				System.out.println("Empty op");
				return engine.display();
				}
			while (op.length() > 0){
				char c = op.charAt(0);
				if (c == '+') engine.add();
				else if (c == '-') engine.subtract();
				else if (c == '*') engine.multiply();
				else if (c == '/') engine.divide();
				else if (c >= '0' && c <= '9') engine.digit(c - '0');
				else if (c == '=') engine.compute();
				else if (c == 'c' || c == 'C') engine.clear();
				else throw new Exception("Unknow operation!");
				op = op.substring(1);
				System.out.println("Next op: "+op);
			}
		}
	}
	public static void main(String []args) throws Exception{
		//try {
		//CalculatorEngine e = new CalculatorEngine();
		//CalculatorInput x = new CalculatorInput(e);
		//x.run();
		new Calc();
		//}catch (Exception e) 
		//{
		//	System.out.println(e.getMessage()); 
		//} 
		//System.out.println("Please restart the program");
	}
}
