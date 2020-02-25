package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().addAnnotatedClass(AlumnoDetalle.class).buildSessionFactory();
		
		Session s=sf.openSession();
		
		s.beginTransaction();
		
	/*	List<Alumno> listado= s.createQuery("from Alumno", Alumno.class).getResultList();
		System.out.println(listado);
		
		
		List<Alumno> listado2=s.createNativeQuery("Select * from talumnos", Alumno.class).getResultList();
		System.out.println(listado2);*/
		
		
	/*	List<AlumnoDetalle> nuevolistado=s.createNativeQuery("select * from talumnosdetalles", AlumnoDetalle.class).getResultList();
		System.out.println(nuevolistado);
		s.getTransaction().commit();*/
		
		Alumno a=new Alumno("Roberto" ,  "C/Rio", "41444uwqao", "Pepe Pepe");
	
		
		AlumnoDetalle ad= new AlumnoDetalle(a,"2", "Marcas", "5");
			s.persist(ad);
			s.getTransaction().commit();
			s.close();
		

	}

}
