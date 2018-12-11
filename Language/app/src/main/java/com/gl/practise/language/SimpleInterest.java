package com.gl.practise.language;


import android.widget.EditText;

public class SimpleInterest  {
    public float a;
    public int b;
    public int c;
    public float d;
    public float simple(float a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        d=(a+b+c)/100;
        return d;
    }

}

