package chainofresponsiblity;

public class TestChain {

	public static void main(String[] args) {
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new Subtract();
		
		chainCalc1.setNextChain(chainCalc2);
		
		Numbers request = new Numbers(4.00,2.00,"add");
		chainCalc1.calculate(request);

	}

}
