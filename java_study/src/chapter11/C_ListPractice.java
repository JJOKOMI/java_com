package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

class EventManagement {
	ArrayList<String> participantList = new ArrayList<>();
	LinkedList<String> waitingQueue = new LinkedList<>();
	
	void addParticipant(String name) {
		participantList.add(name);
	}

	void addToWaitingQueue(String name) {
		waitingQueue.add(name);
	}
	
	void leaveParticipant(String name) {
		if (waitingQueue.size() > 0) {
			String nextParticipant = waitingQueue.remove(0);
			addParticipant(nextParticipant);
		}
	}
	
	boolean checkParticipant(String name) {
		return participantList.contains(name);
	}
}

public class C_ListPractice {
	public static void main(String[] args) {
		EventManagement event = new EventManagement();
		
		event.addParticipant("이승아");
		event.addParticipant("이도경");
		event.addParticipant("이주헌");
		event.addParticipant("이지희");
		event.addParticipant("이지훈");
		
		event.addToWaitingQueue("윤대휘");
		event.addToWaitingQueue("김소빈");
		event.addToWaitingQueue("정규민");
	
		System.out.println(event.participantList);
		System.out.println(event.waitingQueue);
		
		event.leaveParticipant("이승아");
		System.out.println(event.participantList);
		
		event.leaveParticipant("이주헌");
		System.out.println(event.participantList);
		
		System.out.println(event.checkParticipant("이승아"));
		System.out.println(event.checkParticipant("윤대휘"));
		System.out.println(event.checkParticipant("정규민"));
	}
}























