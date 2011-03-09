package org.kedacom.comet.event;

import org.kedacom.comet.CometConnection;
import org.kedacom.comet.CometEngine;
import org.kedacom.event.Event;


public class ConnectedEvent extends Event<CometEngine> {
	private CometConnection conn;
	public ConnectedEvent(CometEngine target,CometConnection anConn) {
		super(target);
		conn = anConn;
	}
	public CometConnection getConn() {
		return conn;
	}
	public void setConn(CometConnection conn) {
		this.conn = conn;
	}
	public void destroy() {
		super.destroy();
		conn = null;
	}
}