package com.toyproject.circulatebmi.policy;

import lombok.AllArgsConstructor;

/**
 *@author tripleJ
 * 남자일 때 체지방량이 어떤 상태인지 알려주는 클래스
 */
@AllArgsConstructor
public class ManBmipolicy {

    public String judgeRange(int height, int weight){
        BmiCalc bmiCalc = new BmiCalc();
        float bmi = bmiCalc.calcualte(height, weight);
        if(bmi>10 && bmi<20){
            return "정상";
        }else if(bmi>20){
            return "비만";
        }else{
            return "저체중";
        }
    }

}

