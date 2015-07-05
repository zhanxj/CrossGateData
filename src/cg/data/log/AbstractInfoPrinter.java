package cg.data.log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public abstract class AbstractInfoPrinter<E> implements InfoPrinter<E> {
	
	private File file;
	
	private FileOutputStream fos;
	
	private boolean outputFile;
	
	public AbstractInfoPrinter() {
		setOutputFile(true);
	}

	@Override
	public void print(E e) {
		write(e.toString() + "\r\n");
	}

	@Override
	public void print(List<E> list) {
		for (E e : list) {
			print(e);
		}
	}

	@Override
	public void print(E[] es) {
		for (E e : es) {
			print(e);
		}
	}
	
	protected String getFileName() {
		return "InfoPrinter";
	}
	
	protected void openOutputStream() {
		if (fos == null) {
			try {
				fos = new FileOutputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected void closeOutputStream() {
		if (fos != null) {
			try {
				fos.flush();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			fos = null;
		}
	}
	
	protected void setOutputFile(boolean outputFile) {
		this.outputFile = outputFile;
		file = outputFile ? new File(getFileName() + ".txt") : null;
		if (!outputFile) {
			closeOutputStream();
		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected boolean getOutputFile() {
		return outputFile;
	}
	
	protected void write(String s) {
		if (getOutputFile()) {
			openOutputStream();
			try {
				fos.write(s.getBytes());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(s);
		}
	}

}
