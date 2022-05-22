package com.toyproject.circulatebmi.policy;

import com.toyproject.circulatebmi.constants.GenderType;

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
                return null;
        }
    }
}
