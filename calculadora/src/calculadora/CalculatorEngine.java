package calculadora;

class CalculatorEngine {
	int value;
	int keep;
	void add(){}
	void subtract(){}
	void multiply(){}
	void divide(){}
	void compute(){}
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
	CalculatorEngine(){clear();}
}
