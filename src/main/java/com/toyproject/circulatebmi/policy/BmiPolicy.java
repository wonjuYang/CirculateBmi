package com.toyproject.circulatebmi.policy;

import lombok.AllArgsConstructor;
/**
 * @author tripleJ
 *
 */
public interface BmiPolicy {

    public String judgeRange(float bmi);

    default float calcualte(int height, int weight){
        return Double.valueOf((weight/((height*0.01)*(height*0.01)))).floatValue();
    }


}
