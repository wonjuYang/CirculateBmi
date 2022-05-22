package com.toyproject.circulatebmi.policy;

import lombok.AllArgsConstructor;
/**
 * @author tripleJ
 *
 */
@AllArgsConstructor
public class BmiCalc {

    public float calcualte(int height, int weight){
        return Double.valueOf((weight/((height*0.01)*(height*0.01)))).floatValue();
    }

}
