package com.capgemini.Lambda;

interface TwoParams{  
    public String say(String name);  
}  
  
public class LambdaTwoParam{  
    public static void main(String[] args) {  
      
    	TwoParams s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Srini"));  
          
        
        TwoParams s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Kolaparthi"));  
    }  
}  