package praktikum7;
import java.util.Arrays;

class gudang {
    public int senjata;
    public String nama_senjata; 
    
    public gudang (String nama_senjata,int senjata) {
        this.senjata = senjata;
        this.nama_senjata = nama_senjata;
    }
}

public class senjata {

		static void swap(gudang[] senjata, int i, int j) {
			gudang temp = senjata[i];
			senjata[i] = senjata[j];
			senjata[j] = temp;
		}
		static int createPart(gudang[] senjata, int first, int last) {
			int pivotIndex = last;
			int storeIndex = first;
			for(int i = first; i < last; i++) {
				if(senjata[i].senjata > senjata[pivotIndex].senjata) {
					swap(senjata, i, storeIndex);
					storeIndex++;
				}
			}
			swap(senjata, storeIndex, pivotIndex);
			return storeIndex;
		}
		
		static void sort(gudang[] senjata, int first, int last) {
			if(first < last) {
				int p = createPart(senjata, first, last);
				sort(senjata, first, p-1);
				sort(senjata, p+1, last);
			}
		}
		
		public static void main(String[] args) {
			gudang[] senjata = new gudang[5];
			senjata[0] = new gudang("AUG", 3000);
			senjata[1]= new gudang("FAMAS", 2500);
			senjata[2]= new gudang("AWP", 4750);
			senjata[3]= new gudang("Deagle", 700);
			senjata[4]= new gudang("M4AI", 3000);
			sort(senjata, 0, senjata.length - 1);
			System.out.println("*********************************");
			System.out.println("    DAFTAR SENJATA (URUT)     ");
			System.out.println("*********************************");
			for(gudang out : senjata) {
				System.out.println(out.nama_senjata +"   "+out.senjata );
			}
		}
		
	}


