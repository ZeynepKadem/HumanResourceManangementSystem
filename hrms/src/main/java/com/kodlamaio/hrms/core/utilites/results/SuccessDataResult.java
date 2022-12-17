package com.kodlamaio.hrms.core.utilites.results;

public class SuccessDataResult<T> extends DataResult<T>{

	public SuccessDataResult(T data, String message) {
		super(data, true,message);
		
	}
	public SuccessDataResult(T data) {  //alternatif
		super(data, true);
		
	}
	public SuccessDataResult( String message) { //alternatif
		super(null,true,message);
		
	}

}
