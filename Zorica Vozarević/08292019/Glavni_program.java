package domaci0829;

public class Glavni_program {

	public static void main(String[] args) {
		Student s1 = new Student("Zoka", "Zoka", 1990, 10002019, 1, 6.9);
        Student s2 = new Student("Ivan", "Ivan", 1987, 10022019, 3, 7.80);
        Student s3 = new Student("Marko", "Maro", 1999, 32019, 1, 9.9);
        Profesor p1 = new Profesor("Zoka", "Zoka", 1990, "doktor nauka");
        Profesor p2 = new Profesor("Marko", "Marko", 1999, "diplomirani");
        p1.dodajPredmet("QP");
		p2.dodajPredmet("PhV");
        System.out.println(s1.ispis());
        System.out.println(s2.ispis());
        System.out.println(s3.ispis());
        
        System.out.println(p1.ispisp()+p1);
        System.out.println(p2.ispisp()+p2);

	}

}
