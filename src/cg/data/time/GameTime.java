package cg.data.time;

public interface GameTime {
	
	byte TIME_ALL = 0;
	
	byte TIME_MORNING = 1;
	
	byte TIME_DAY = 2;
	
	byte TIME_DUSK = 4;
	
	byte TIME_NIGHT = 8;
	
	byte getDayState();

}
