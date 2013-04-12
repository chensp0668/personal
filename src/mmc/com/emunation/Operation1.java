package mmc.com.emunation;

public enum Operation1 {
	PLUS, MINUS, TIMES, DIVIDE;
	double apply(int x,int y){
		switch(this){
		case PLUS: return x + y;
		case MINUS: return x - y;
		case TIMES: return x * y;
		case DIVIDE: return x / y;
		}
		throw new AssertionError("Unknown op: " + this);
	}
}
