package newfeatures.lambda;

public class TestLambdaNoParameter {

public static void main(String[] args) {
	NoParameterInterface msg = () ->  "Hi";
	System.out.println(msg.sayHello());
}

}
