package cg.data.quest;

public interface QuestEvent {
	
	byte STATE_NOW = 0;
	
	byte STATE_FINISH = 1;
	
	byte STATE_FAILED = 2;
	
	int getId();
	
	byte getState();

}
