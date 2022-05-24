package com.toyproject.circulatebmi.controller;

import com.toyproject.circulatebmi.constants.GenderType;
import com.toyproject.circulatebmi.policy.BmiPolicy;
import com.toyproject.circulatebmi.policy.BmiPolicyFactory;
import com.toyproject.circulatebmi.policy.ManBmipolicy;
import com.toyproject.circulatebmi.policy.WomanBmipolicy;
import com.toyproject.circulatebmi.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author tripleJ
 *
 * BMI를 계산하여 조회하는 컨트롤러
 *
 *
 */
@RestController
@AllArgsConstructor
public class CirculateBmiQueryController {

    private final PersonService personService;

    //여자야 남자야, 키, 몸무게 물어볼거고 나는 BMI지수와 정상인지 아닌지를 알려줄거야
    @GetMapping("api/calc/bmi")
    public String judgeBmi(@RequestParam GenderType genderType,
                         @RequestParam int height,
                         @RequestParam int weight) {

        BmiPolicy policy = BmiPolicyFactory.of(genderType);

        float bmi = policy.calcualte(height, weight);
        return policy.judgeRange(bmi);




    }

    //특정 사람의 ID를 입력하면 그사람은 정상인지, 비만인지, 미달인지 알려주는 서비스
    @GetMapping("/api/calc/person/{personId}")
    public String JudgeBmiByPersonId(@PathVariable Long personId,
                                     @RequestParam GenderType genderType){


        BmiPolicy policy = BmiPolicyFactory.of(genderType);
        int height = personService.getHeightOrThrow(personId);
        int weight = personService.getWeightOrThrow(personId);
        float bmi = policy.calcualte(height, weight);
        return policy.judgeRange(bmi);
    }






}
