/*
 * 1. Crie uma classe java que contenha uma lista
 * 2. Via reflection, intancie essa lista
 * 3. Coloque objetos na lista criada no console
 * 4. Também usando reflection, itere a lista exibindo 
 *    seus valores no console
 * */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	public static void main(String[] args) throws Exception {
		Class<?> minhaClasseRef = Class.forName("MinhaClasse");
		Object minhaClasseInstancia = minhaClasseRef.getDeclaredConstructor().newInstance();
		
		Field campoLista = minhaClasseRef.getDeclaredField("lista");
		campoLista.setAccessible(true);
		
		Class<?> arrayListRef = Class.forName("java.util.ArrayList");
		Constructor<?> construtorArrayList = arrayListRef.getDeclaredConstructor();
		Object listaInstancia = construtorArrayList.newInstance();
		
		Method metodoAdd = arrayListRef.getMethod("add", Object.class);
		metodoAdd.invoke(listaInstancia, "Maria");
		metodoAdd.invoke(listaInstancia, "João");
		metodoAdd.invoke(listaInstancia, "Pedro");
		
		Method metodoSize = arrayListRef.getMethod("size");
		Method metodoGet = arrayListRef.getMethod("get", int.class);
		
		int tamanho = (int) metodoSize.invoke(listaInstancia);
		
		System.out.println("Itens da lista (via reflection): ");
		for (int i = 0; i < tamanho; i++) {
			Object valor = metodoGet.invoke(listaInstancia, i);
			System.out.println("- " + valor);
		}
	}
}
