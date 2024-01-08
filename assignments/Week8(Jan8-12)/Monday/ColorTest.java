package Monday;

public class ColorTest {

    public static void main(String[] args) {

        Color color1 = new Color();
        Color color2 = new Color("blue", 102, 102, 255);
        Color color3 = new Color("trueblue", 102, 102, 255);
        Color color4 = new Color("blue", 100, 100, 200);

        System.out.println(color1);
        System.out.println(color2);
        
        System.out.println(color2.equals(color3));
        System.out.println(color2.equals(color4));
    }
    
}
