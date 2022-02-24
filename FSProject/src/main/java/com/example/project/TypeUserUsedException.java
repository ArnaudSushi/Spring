package com.example.project;

import java.sql.SQLIntegrityConstraintViolationException;

public class TypeUserUsedException extends SQLIntegrityConstraintViolationException {

	public TypeUserUsedException() {
		// TODO Auto-generated constructor stub
	}

	public TypeUserUsedException(String reason) {
		super(reason);
		// TODO Auto-generated constructor stub
	}

	public TypeUserUsedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public TypeUserUsedException(String reason, String SQLState) {
		super(reason, SQLState);
		// TODO Auto-generated constructor stub
	}

	public TypeUserUsedException(String reason, Throwable cause) {
		super(reason, cause);
		// TODO Auto-generated constructor stub
	}

	public TypeUserUsedException(String reason, String SQLState, int vendorCode) {
		super(reason, SQLState, vendorCode);
		// TODO Auto-generated constructor stub
	}

	public TypeUserUsedException(String reason, String SQLState, Throwable cause) {
		super(reason, SQLState, cause);
	}

	public TypeUserUsedException(String reason, String SQLState, int vendorCode, Throwable cause) {
		super(reason, SQLState, vendorCode, cause);
	}

}
