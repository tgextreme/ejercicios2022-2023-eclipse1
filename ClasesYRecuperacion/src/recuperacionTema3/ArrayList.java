package recuperacionTema3;

public class ArrayList<E> extends AbstractList<E>{
	private static final int CAPACIDAD_INICIAL = 16;
	private E[] data = (E[]) new Object[CAPACIDAD_INICIAL];
	
	public ArrayList() {
		
	}
	
	public ArrayList(E[] objects) {
		this.size = objects.length;
		ensureCapacity();
		for(int i = 0; i<objects.length; i++) {
			data[i] = objects[i];
		}
		try {
			trimToSize();
		}catch(RuntimeException e) {
			
		}
	}
	
	private void checkIndex(int index) {
		if(index<0 || index > data.length-1) {
			throw new IndexOutOfBoundsException("Error");
		}
	}
	
	private void ensureCapacity() {
		if(data.length<size) {
			E[] arrayGrande = (E[]) new Object[data.length*2];
			for(int i = 0; i<data.length; i++) {
				arrayGrande[i] = data[i];
			}
			data = arrayGrande;
		}
	}
	
	public void trimToSize() {
		if(data.length> size) {
			E[] arrayAjustado = (E[]) new Object[size];
			for(int i = 0; i<size; i++) {
				arrayAjustado[i] = data[i];
			}
			data = arrayAjustado;
		}
	}
	
	public void add(int index, E e) {
		checkIndex(index);
		size++;
		ensureCapacity();
		E[] arrayRetocado = (E[]) new Object[size];
		if(index == 0) {
			arrayRetocado[0] = e;
			for(int i = 1; i<arrayRetocado.length; i++) {
				arrayRetocado[i] = data[i-1];
			}
		}else if(index == size-1) {
			for(int i = 0; i<size-1; i++) {
				arrayRetocado[i] = data[i];
			}
			arrayRetocado[size-1] = e;
		} else {
			for(int i = 0; i<index; i++) {
				arrayRetocado[i] = data[i];
			}
			arrayRetocado[index]= e;
			for(int i = index;i<arrayRetocado.length-1; i++) {
				arrayRetocado[i+1] = data[i];
			}
			
			data = arrayRetocado;
			trimToSize();
		}
	}
	
	
	public void clear() {
		E[] arrayBorrado = (E[]) new Object[CAPACIDAD_INICIAL];
		size = 0;
	}
	
	public boolean contains(E e) {
		for(int i = 0; i<size-1; i++) {
			if(data[i].equals(e)) {
				return true;
			}
		}
		return false;
	}
	
	public E get(int index) {
		checkIndex(index);
		return data[index];
	}
	
	public int indexOf(E e) {
		int detectado = 0; 
		for(int i = 0; i<size; i++) {
			if(data[i].equals(e)) {
				detectado = i;
				break;
			}
		}return detectado;
	}
	
	public int lastIndexOf(E e) {
		int detectado = 0;
		for(int i =size; i>0; i--) {
			if(data[i].equals(e)) {
				detectado = i;
				break;
			}
		}return detectado;
	}
	
	public E remove(int index) {
		checkIndex(index);
		size--;
		E[] arrayAjustado = (E[]) new Object[size];
		E eliminado= get(index);
		
		if(index ==0) {
			for(int i = index+1; i<size+1; i++) {
				arrayAjustado[i-1] = data[i];
			}
		}else if(index == size) {
			for(int i = 0; i<size; i++) {
				arrayAjustado[i] = data[i];
				}
			}	
		else {
			for(int i = 0; i<index; i++) {
				arrayAjustado[i] = data[i];
				}
			for(int i = index+1; i<size+1; i++) {
				arrayAjustado[i-1] = data[i];
				}
			}
		data=arrayAjustado;
		return eliminado;
		}
	
	
	public E set(int index, E e) {
		checkIndex(index);
		E sustituido = data[index];
		data[index] = e;
		return sustituido;
	}
	@Override
	public String toString() {
		String texto = "[";
		for(int i = 0; i<size-1; i++) {
			texto += data[i] + ", ";
		}texto += data[size-1] + "]";
		return texto;
	}
	
	
}
	
	
