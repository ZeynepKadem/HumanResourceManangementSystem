package com.kodlamaio.hrms.core.utilites.results;


public class DataResult<T> extends Result{

	private T data ;
	public DataResult(T data, boolean success, String message) {
		super(success, message); //super base sınıfın(Result) constructor ını çalıştırmaya yarıyor.
		
		this.data=data; //this o sınıfın , super base sınıfın demek.
	}

	public DataResult(T data, boolean success) {
		super(success); 
		
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}

}
