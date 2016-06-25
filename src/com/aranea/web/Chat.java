package com.aranea.web;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.apache.catalina.SessionEvent;
import org.apache.catalina.SessionListener;
@ServerEndpoint
(
    value="/chat"		
 		
)
public class Chat implements SessionListener {


	@OnOpen
	public void onOpen(Session session){
		System.out.println("Connection opened");
	}
	
	@OnClose
	public void onClose(Session session){
		System.out.println("Connection closed");
	}
	@OnMessage
	public void onMassage(Session session,String message) throws IOException{
		//System.out.println(massage.getBytes());
		//session.getBasicRemote().sendText(massage+"from Server");
		session.getBasicRemote().sendText(message+"from Server");
		System.out.println("on Massage " + message);
	}
	@OnError
	public void onError(Throwable t){
		System.out.println(t.getMessage());
	}
	
	@Override
	public void sessionEvent(SessionEvent arg0) {
		
		
	}
	
	

}
