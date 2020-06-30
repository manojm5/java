package newfeatures.lambda;

public class LambdaMultipleParameter {
	
	public static void main(String[] args) {
		MultipleParameterInterface mInterface = (str1,str2)-> str1+str2;
		System.out.println(mInterface.sconcat("Hello","world"));
	}

}
