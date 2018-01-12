import java.util.ArrayList;
import java.util.Arrays;
public class randomZeros {

	public static void main(String[] args) {
		ArrayList<Integer> numsRandom=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			int random;
			random=(int)(Math.random()*11)+0;
			numsRandom.add(random);
		}
		System.out.println(numsRandom);
		for(int i=0;i<numsRandom.size();i++) {
			numsRandom.set(i, 0);
		}
		System.out.println(numsRandom);
	}

}
