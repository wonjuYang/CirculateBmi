package com.toyproject.circulatebmi.policy;

import com.toyproject.circulatebmi.constants.GenderType;
import com.toyproject.circulatebmi.exception.BmiException;
import com.toyproject.circulatebmi.exception.ErrorCode;

public class BmiPolicyFactory {
    private static final ManBmipolicy manBmiPolicy = new ManBmipolicy();
    private static final WomanBmipolicy womanBmiPolicy = new WomanBmipolicy();



    public static BmiPolicy of(GenderType genderType) {
        switch (genderType) {
            case MAN:
                return manBmiPolicy;
            case WOMAN:
                return womanBmiPolicy;
            default:
                throw new BmiException(ErrorCode.INVALID_REQUEST, "해당 genderType에 대한 정책이 존재하지 않습니다.");
        }
    }
}
