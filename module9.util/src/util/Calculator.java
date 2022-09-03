package util;

import util.helper.Addhelper;

public class Calculator {

    Addhelper addhelp=new Addhelper();
    public int add(int i, int j){
        return addhelp.add(i,j);
    }

    public int add(double i, double j){
        return addhelp.add((int)i,(int)j);
    }
}
