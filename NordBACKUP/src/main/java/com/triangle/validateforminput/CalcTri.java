package com.triangle.validateforminput;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;


public class CalcTri {
    static String tritype(Float[] sidels) {





        Double A = Double.valueOf(sidels[0]);
        Double B = Double.valueOf(sidels[1]);
        Double C = Double.valueOf(sidels[2]);

        String trtype = new String();

        if (Double.compare(A,B)==0 && Double.compare(B,C)==0 && Double.compare(A,C)==0){
            trtype = "Equilateral";
        }

        if((Double.compare(A,B)==0 && Double.compare(B,C)!=0) || (Double.compare(B,C)==0 && Double.compare(C,A)!=0) || (Double.compare(A,C)==0 && Double.compare(C,B)!=0)){
            trtype = "Isosceles";
        }


        if (Double.compare(A,B)!=0 && Double.compare(B,C)!=0 && Double.compare(A,C)!=0){
            trtype = "Scalene";
        }

        if(A==0 ||B==0 || C==0 ) {
            trtype = "None of them!";
        }


        return trtype;
    }

}
