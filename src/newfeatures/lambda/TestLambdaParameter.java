package newfeatures.lambda;

public class TestLambdaParameter {

public static void main(String[] args) {
	ParameterInterface parameterInterface = (num) -> num+1;
	System.out.println(parameterInterface.increment(3));
	
	
}

}
