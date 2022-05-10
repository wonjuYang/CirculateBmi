package com.toyproject.circulatebmi.controller;

import com.toyproject.circulatebmi.constants.genderType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CirculateBmiQueryController {

    @GetMapping("api/calc/bmi")
    public float calcBmi(@RequestParam genderType genderType,
                         @RequestParam int height,
                         @RequestParam int weight){
        //TODO: BMI 계산하는 로직

        return 0;
        //여자야 남자야, 키, 몸무게 물어볼거고 나는 BMI지수와 정상인지 아닌지를 알려줄거야

    }
}
