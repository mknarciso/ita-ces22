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
	void add() throws Exception { binaryOperation('+');}
	void subtract() throws Exception { binaryOperation('-');}
	void multiply() throws Exception { binaryOperation('*');}
	void divide() throws Exception { binaryOperation('/');}
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
