package calculadora;

class CalculatorEngine {
	int value;
	int keep;
	char toDo;
	void binaryOperation(char op) throws Exception {
		keep = value;
		value = 0;
		toDo = op;
	}
	void add(){ binaryOperation('+');}
	void subtract(){ binaryOperation('-');}
	void multiply(){ binaryOperation('*');}
	void divide(){ binaryOperation('/');}
	void compute() throws Exception {
		if (toDo == '+')
			value = keep + value;
		else if (toDo == '-')
			value = keep - value;
		else if (toDo == '*')
			value = keep * value;
		else if (toDo == '/'){
			if (value==0)
				throw new Exception("Can not divide by zero!");
			value = keep / value;
		}
		keep = 0;
	}
	void clear(){
		value = 0;
		keep = 0;
	}
	void digit(int x){
		value = value*10 + x;
	}
	int display(){
		return value;
	}
	CalculatorEngine(){
		clear();
	}
}
