package cg.data.log;

import java.util.List;
import java.util.Map;

public interface InfoPrinter<E> {
	
	void print(E e);
	
	void print(List<E> list);
	
	void print(Map<?, ?> map);
	
	void print(E[] es);

}
