public class Complex{
    private double a;
    private double b;
    Complex(double a1,double b1)
    {
        a=a1;
        b=b1;
    }
    Complex add(Complex c2)
    {
        Complex c=new Complex(0.0,0.0);
        c.a=a+c2.a;
        c.b=b+c2.b;
        return c;
    }
    Complex sub(Complex c2)
    {
        Complex c=new Complex(0.0,0.0);
        c.a=a-c2.a;
        c.b=b-c2.b;
        return c;
    }
    Complex mul(Complex c2)
    {
        Complex c=new Complex(0.0,0.0);
        c.a=(a*c2.a)-(b*c2.b);
        c.b=(a*c2.b)+(b*c2.a);
        return c;
    }
    Complex div(Complex c2)
    {
        Complex c=new Complex(0.0,0.0);
        c.a=((a*c2.a)+(b*c2.b))/((c2.a*c2.a)+(c2.b*c2.b));
        c.b=((b*c2.a)-(a*c2.b))/((c2.a*c2.a)+(c2.b*c2.b));
        return c;
    }
    void display()
    {
        System.out.print(a + "+" + "i" + b);
    }
    public static void main(String args[])
    {
        Complex complex1=new Complex(3.0,4.0);
        Complex complex2=new Complex(8.0,-2.0);
        System.out.print("First Complex Number: ");
        complex1.display();
        System.out.println();
        System.out.print("Second Complex Number: ");
        complex2.display();
        System.out.println();
        Complex complexsum=complex1.add(complex2);
        System.out.print("Sum: ");
        complexsum.display();
        System.out.println();
        Complex complexsub=complex1.sub(complex2);
        System.out.print("Difference: ");
        complexsub.display();
        System.out.println();
        Complex complexmul=complex1.mul(complex2);
        System.out.print("Multiplication: ");
        complexmul.display();
        System.out.println();
        Complex complexdiv=complex1.div(complex2);
        System.out.print("Division: ");
        complexdiv.display();
    }
}