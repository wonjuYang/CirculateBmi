package com.toyproject.circulatebmi.policy;

import lombok.AllArgsConstructor;

/**
 * @author tripleJ
 * 여자일 때 체지방량이 어떤 상태인지 알려주는 클래스
 */
@AllArgsConstructor
public class WomanBmipolicy {


    public String judgeRange(int height, int weight){
        BmiCalc bmiCalc = new BmiCalc();
        float bmi = bmiCalc.calcualte(height, weight);
        if(bmi>=18 && bmi<=28){
            return "정상";
        }else if(bmi>28){
            return "비만";
        }else{
            return "저체중";
        }
    }

}

