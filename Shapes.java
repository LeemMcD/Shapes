
public class Shapes
{
    public int volume;
    public int length;
    public int width;
    public int height;

    




    public Shapes(int baseL, int baseW, int pyramidH)
    {
        int baseL = length;
        int baseW = width;
        int pyramidH = height;

    }

    public class Triangle extends Shapes
    {
    private int angle1;
    private int angle2;
    private int angle3;
    private String TriType;

    }

    public class Pyramid extends Triangle
    {
        super(length);
        super(wigth);
        super(height);
        
        //private int baseArea;

    }
    public class tetrahedron extends Triangle
    {

    }
    public class TriPrism extends Triangle
    {

    }
}
