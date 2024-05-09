package cadenas;

public class DevuelveUltimaLetra {
	void ultimaLetra (String valor) {
		System.out.println(valor.charAt(valor.length()-1));
	}
	
public static void main(String[] args) {
	DevuelveUltimaLetra i = new DevuelveUltimaLetra();
	i.ultimaLetra("Ramon");
}
}
