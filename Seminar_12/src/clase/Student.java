package clase;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String nume;
	private List<Integer> note;

    public Student(String nume) {
        this.nume = nume;
        this.note = new ArrayList<>();
    }

    public Student() {
        this.nume = "Student";
        this.note = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Integer> getNote() {
        return note;
    }

    public void adaugaNota(int nota){
        note.add(nota);
    }

    public float calculeazaMedie(){
        float suma=0;
        for(int nota:note){
            suma+=nota;
        }
        if(note.size()>0){
            return suma/note.size();
        }
        return suma;
    }

    public int getNota(int index){
        if(index>=0 && index< note.size()){
            return note.get(index);
        }
        throw new IndexOutOfBoundsException();
    }
    
    public boolean areRestante() {
    	for(int nota:note) {
    		if(nota<5) {
    			return false;
    		}
    	}
    	return true;
    }

}
