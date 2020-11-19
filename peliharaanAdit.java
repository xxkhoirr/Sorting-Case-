package praktikum7;
import java.util.Arrays;

public class peliharaanAdit {
	public String[] hewan1;
	String[] hewan = new String[5];
	
	static void selectionSort(String[] hewan2) {
		for(int i=0; i<hewan2.length-1; i++) {
			int minElementIndex=i;
			for(int j=i+1; j<hewan2.length; j++) {
				if(hewan2[j].charAt(0) < hewan2[minElementIndex].charAt(0)) {
					minElementIndex = j;
				}
			}
			int Q =0;
			int x;
			boolean flag = true;
			if(hewan2[minElementIndex].length() < hewan2[i].length()) {
				x= hewan2[minElementIndex].length();
			}else {
				x= hewan2[i].length();
			}
			while(flag) { 
				if(hewan2[minElementIndex].charAt(Q) !=hewan2[i].charAt(Q)) {
					swap(hewan2, i, minElementIndex);
					flag = false;
				}else flag = true;
				Q++;	
				if(Q == x) { 
					flag = false;
				}
			}
		}
	}
	
	static void swap(String[] hewan2, int i, int j) {
		String temp=hewan2[i];
		hewan2[i]=hewan2[j];
		hewan2[j]=temp;
	}
	
	public static void main(String[] args) {
		String[] hewan = new  String[7];
		hewan[0] ="Ayana";
		hewan[1] ="buaya";
		hewan[2] ="Ika";
		hewan[3] ="Unta";
		hewan[4] ="unta";
		hewan[5] ="ayanalagi";
		hewan[6] ="melatipus";
		selectionSort(hewan);
		System.out.println(" --- DAFTAR NAMA PELIHARAAN (URUT) --- ");
		System.out.println(" ");
		System.out.println(Arrays.toString(hewan));
	}
}
