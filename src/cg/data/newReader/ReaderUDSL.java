package cg.data.newReader;

import java.util.List;

import dataplatform.udsl.ReadOnlyUDSL;

public class ReaderUDSL implements ReadOnlyUDSL {

	@Override
	public <T> T fetch(Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> find(Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Deprecated
	@Override
	public <T> List<T> orderBy(boolean dec, Object... params) {
		return null;
	}

	@Deprecated
	@Override
	public <T> List<T> limit(int offset, int count, Object... params) {
		return null;
	}

}
