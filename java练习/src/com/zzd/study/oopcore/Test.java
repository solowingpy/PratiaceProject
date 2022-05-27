package com.zzd.study.oopcore;

import com.zzd.study.oopcore.poly.Kind;
import com.zzd.study.oopcore.poly.LiuJiang;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("i7-10750H","16GB","1.5T","戴尔");
        NotePad notePad = new NotePad("晓龙870","2G","unkown","红色");
        notePad.getDetails();
        pc.getDetails();

    }
}
