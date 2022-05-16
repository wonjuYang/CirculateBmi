package com.toyproject.circulatebmi.controller;

import com.toyproject.circulatebmi.constants.GenderType;
import com.toyproject.circulatebmi.policy.ManBmipolicy;
import com.toyproject.circulatebmi.policy.WomanBmipolicy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CirculateBmiQueryController {


    @GetMapping("api/calc/bmi")
    public String judgeBmi(@RequestParam GenderType genderType,
                         @RequestParam int height,
                         @RequestParam int weight) {
        if (genderType == GenderType.MAN) {
            ManBmipolicy policy = new ManBmipolicy();
            return policy.judgeRange(height, weight);
        } else if (genderType == GenderType.WOMAN) {
            WomanBmipolicy policy = new WomanBmipolicy();
            return policy.judgeRange(height, weight);
        }

        return null;

        //여자야 남자야, 키, 몸무게 물어볼거고 나는 BMI지수와 정상인지 아닌지를 알려줄거야

    }
}
