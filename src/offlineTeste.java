import java.util.List;

import controller.PacienteController;
import model.Paciente;

public class offlineTeste {

	public static void main(String[] args) {
		Paciente p1 = new Paciente();
		PacienteController con = new PacienteController();
		p1.setNome("Gabigol");
		p1.setNomeResponsavel("Libertadores");
		p1.setCpf("12313111");
		
		
		Paciente p2 = new Paciente();
		p2.setNome("Gabigol");
		p2.setCpf("331231");
		p2.setNomeResponsavel("Brasileirão");
		
		
		
		
		con.salvarPaciente(p1);
		con.salvarPaciente(p2);
		List<Paciente> p = con.findManyPaciente("Gabigol");
		for(int i = 0; i <p.size(); i++) {
			System.out.println(p.get(i).getNomeResponsavel());
		}
		

	}

}
