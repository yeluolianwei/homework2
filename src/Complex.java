import java.util.concurrent.Callable;

public class Complex {
    private int real;//实部
    private int imag;//虚部

    public Complex(){                                  //无参
        real =0;
        imag=0;
    }
    public Complex(int real,int imag) {          //有参
        this.real = real;
        this.imag = imag;
    }
    public Complex add(Complex x,Complex y){        //以复数类的形式返回一个复数    //求和
        Complex z=new Complex();
        z.real=x.real+y.real;
        z.imag=x.imag+y.imag;
        return z;
    }
    public Complex sub(Complex x,Complex y){        //以复数类的形式返回一个复数     //求差
        Complex z =new Complex();
        z.real=x.real+y.real;
        z.imag=x.imag+y.imag;
        return z;
    }
    public Complex mul(Complex x,Complex y){             //以复数类的形式返回一个复数      //求积
        Complex z = new Complex();
        z.real =(x.real * y.real)-(x.imag * y.imag);  //公式
        z.imag =(x.imag * y.real)+(x.real * y.imag);
        return z;
    }
    public Complex div(Complex x,Complex y){         // 以复数类的形式返回一个复数 //求商
        Complex z = new Complex();
        z.real=(x.real*y.real + x.imag*y.imag)/(y.real*y.real+y.imag*y.imag);    //公式

        z.imag=(x.imag*y.real-x.real*y.imag)/(y.real*y.real+y.imag*y.imag);
        return z;
    }
    public String toString() {                      //返回字符串
        if(imag>0)
            return real+"+"+imag+"i";
        else
            return real+"-"+imag+"i";


    }

    public void display(){             //显示复数
        if(imag>0)
        System.out.println("复数："+real+"+"+imag+"i");
        else
            System.out.println("复数："+real+"-"+imag+"i");
    }

    public void setReal(int real) {         //设置实部
        this.real = real;
    }

    public void setImag(int imag) {        //设置虚部
        this.imag = imag;
    }
}
