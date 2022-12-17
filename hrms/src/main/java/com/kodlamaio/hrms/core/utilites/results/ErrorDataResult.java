package com.kodlamaio.hrms.core.utilites.results;

public class ErrorDataResult<T> extends DataResult<T>{

	public ErrorDataResult(T data, String message) { //alternatif, error da data göndermek isteyebiliriz.
		super(data, false,message);
		
	}
	public ErrorDataResult(T data) { 
		super(data, true);
		
	}
	public ErrorDataResult( String message) { //alternatif
		super(null,false,message);
		
	}

}
