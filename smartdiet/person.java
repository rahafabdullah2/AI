/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartdiet;

/**
 *
 * @author rahafabdullah
 */
public class person {
    
    public String name;
    public int weight;
    public int height;
    public int age ;
    public String gender;
    public String food;
    
    public person(String n,int w,int h,int a, String g, String f){
        name=n;weight=w;height=h;age=a;gender=g;food=f;
      
    }

   
        public float countcalories(person p){
        float cal=0;
       if ("F".equals((p.gender.substring(0))) || "f".equals((p.gender.substring(0))))
    
        cal=(float) (655.1+(4.35*p.weight)+(4.7*p.height)-(4.7*p.age));
       else 
         
        cal=(float) (66+(6.2*p.weight)+(12.7*p.height)-(6.76*p.age));   
         
        return cal;
        
    } 
}
