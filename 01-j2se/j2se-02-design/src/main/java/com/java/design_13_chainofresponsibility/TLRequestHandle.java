package com.java.design_13_chainofresponsibility;

public class TLRequestHandle implements RequestHandle {
	RequestHandle rh;

	public TLRequestHandle(RequestHandle rh) {
		this.rh = rh;
	}

	public void handleRequest(Request request) {
		if (request instanceof LeaveRequest) {
			System.out.println("要请假, 项目组长审批!");
		} else {
			rh.handleRequest(request);
		}
	}

}
