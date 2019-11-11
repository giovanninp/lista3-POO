package repo.utils;

import java.util.ArrayList;

public class rangeChecker {
	public boolean noLimite (int size,int index) {
		return ((size >= index || index < 0) ? false : true);
	}
	public boolean temAlgo(ArrayList<?> list) {
		return ((list.size() > 0) ? true : false);
	}
}
