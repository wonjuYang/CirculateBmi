package com.toyproject.circulatebmi.exception;

public class BmiException extends RuntimeException{
  private ErrorCode errorCode;
  private String message;

  public BmiException(ErrorCode errorCode){
    this(errorCode, errorCode.getMessage());

  }

  public BmiException(ErrorCode errorCode, String customMessage){
    super(customMessage);
    this.errorCode = errorCode;
    this.message = customMessage;
  }

}
