package cg.data.map;

public interface LocalInfo {
	
	int getMapId();
	
	int getEast();
	
	int getSouth();
	
	void update(int mapId, int east, int south);

}
