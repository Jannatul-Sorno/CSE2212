package chainofresponsiblity;

public class Subtract implements Chain {
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	@Override
		public void calculate(Numbers requests) {
			if(requests.getCalculationWanted()=="sub") {
			System.out.println(requests.getNumber1() + "-" + requests.getNumber2() + "="+ (requests.getNumber1()-requests.getNumber2()));
			}
			else
			{  
			 nextInChain.calculate(requests);
			}

		}

	}
