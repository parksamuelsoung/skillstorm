interface Bozo{ 
    // java can choose to read/not read this if applicable   
    int type = 0;      
    public void jump(); 
}   
    
public class Type1Bozo implements Bozo { 

    // or comment this out (not here originally)
    private int type;

    public Type1Bozo(){ 
        
        // java can choose to read/not read this if applicable
        // int type = 1;
        // compilation error starts here.
        type = 1;     
    }      

    public void jump(){             
        System.out.println("jumping..."+type);          
    }           
    
    public static void main(String[] args) {             
        Bozo b = new Type1Bozo();             
        b.jump();          
    } 
} 