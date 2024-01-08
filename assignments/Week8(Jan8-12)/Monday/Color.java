package Monday;

public class Color {
    
    private String name;
    private byte r;
    private byte g;
    private byte b;

    public Color() {
        this.name = "white";
        this.r = (byte) 255;
        this.g = (byte) 255;
        this.b = (byte) 255;
    }
    
    public Color(String name, int r, int g, int b) {
        this.name = name;
        this.r = (byte) r;
        this.g = (byte) g;
        this.b = (byte) b;
    }

    public String getName() {
        return name;
    }

    public int getR() {
        return r & 0xff;
    }

    public int getG() {
        return g & 0xff;
    }

    public int getB() {
        return b & 0xff;
    }

    @Override
    public String toString() {
        return "Color [name=" + name + ", r=" + getR() + ", g=" + getG() + ", b=" + getB() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + r;
        result = prime * result + g;
        result = prime * result + b;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Color other = (Color) obj;
        return r == other.r && g == other.g && b == other.b;
    }

    
    
}
