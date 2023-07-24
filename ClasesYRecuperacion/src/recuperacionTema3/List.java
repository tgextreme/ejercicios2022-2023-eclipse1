package recuperacionTema3;

public interface List<E> extends Iterable<E>{
	
	/**
	 * A�ade un nuevo elemento al final de la lista.
	 * @Param e es el elemento que se a�ade al final de la lista.
	 */
	public void add(E e);
	
	/**
	 * A�ade un nuevo elemento en la posicion indicada por index en la lista.
	 * @Param e es el elemento que se a�ade en la posicion indicada por index a la lista.
	 */
	
	public void add(int index, E e);
	
	
	/**
	 * Borra todos los elementos de la lista.
	 */
	
	public void clear();
	
	/**
	 * Booleano que devuelve true si encuentra el elemento e dado por parametro en la lista.
	 * @Returns true si el elemento que se busca se ha encontrado.
	 * @Param e es el elemento que se pretende encontrar en la lista.
	 */
	
	public boolean contains(E e);
	
	/**
	 * Devuelve el elemento e indicado por index en la lista.
	 * @Returns el elemento que indica el index en la lista. Si no est�, devuelve -1.
	 * @Param index es el numero que indica la posicion donde hay que sacar el elemento.
	 */
	
	public E get(int index);
	
	/**
	 * Devuelve la posicion de la primera ocurrencia del elemento e buscado en la lista. Si no est�, devuelve -1
	 * @Returns el index (la posicion) de la primera ocurrencia del elemento e en la lista. Si no est�, devuelve -1
	 * @Param e es el elemento del cual se quiere daber su posicion.
	 */
	
	public int indexOf(E e);
	
	/**
	 * Booleano que devuelve true si la lista no tiene elementos 
	 * @Returns true si la lista no tiene elementos.
	 */
	
	public boolean isEmpty();
	
	/**
	 * Devuelve la posicion de la ULTIMA ocurrencia del elemento e en la lista.Si dicho elemento no est�, devuelve -1.
	 * @Returns la posicion de la ultima ocurrencia del elemento e en la lista. Si no est�, devuelve -1.
	 * @Param e es el elemento del cual se quiere saber su posicion.
	 */
	public int lastIndexOf(E e);
	
	/**
	 * Elimina el �ltimo elemento de la lista, desplaza la subsecuencia de elementos a la izquierda y devuelve true una vez que el elemento ha sido eliminado.
	 * @Returns true si el elemento ha sido eliminado con �xito.
	 * @Param e es el elemento de la lista que se pretende borrar.
	 */
	public boolean remove(E e);
	
	/**
	 * borra el elemento de la lista indicado por index. Adem�s, desplaza la subsecuencia de elementos de la lista 
	 * a la izquierda y devuelve el elemento que ha sido eliminado.	
	 * @param index es la posicion del elemento que se pretende eliminar y devolver.
	 * @return el elemento de la lista que se ha eliminado.
	 */
	
	public E remove(int index);
	
	/**
	 * Sustituye el elemento que indica el index en la lista por el elemento e.
	 * adem�s, devuelve el elemento que ha sido reemplazado.
	 * @param index es la posicion que se�ala al elemento de la lista
	 * @param e es el elemento que se pretende poner de sustituto en la lista.
	 * @return el elemento de la lista reemplazado.
	 */
	
	public Object set(int index, E e);
	
	/**
	 * Devuelve el numero de elementos que tiene la lista.
	 * @returns el n�mero de elementos que tiene la lista.
	 */
	public int size();
}
