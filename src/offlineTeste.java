import java.util.List;

import controller.DentistaController;
import model.Dentista;

public class offlineTeste {

	public static void main(String[] args) {
		Dentista p1 = new Dentista();
		DentistaController con = new DentistaController();
		p1.setNome("Gabigol");
		
		p1.setCro("12313111");
		
		
		 Dentista p2 = new Dentista();
		p2.setNome("Gabigol");
		p2.setCro("331231");
	
		
		con.salvarDentista(p1);
		con.salvarDentista(p2);
		
		

		List<Dentista> p = con.findManyDentista("Gabigol");
		for(int i = 0; i <p.size(); i++) {
			System.out.println(p.get(i).getCro());
		}
		

	}

}
