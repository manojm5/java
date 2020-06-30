package com.capgemini.Lambda;

interface CanvasHtml5  {
    public void draw();  
}  
public class WithOutLambda {  
    public static void main(String[] args) {  
        int width=10; 
        int height=20;
  
       // CanvasHtml5 d1=new CanvasHtml5();
        
        CanvasHtml5 d=new CanvasHtml5(){  
            public void draw(){System.out.println("Drawing "+width+":"+height);}  
        };  
        d.draw();  
    }  
}  