package streamexamples;

import java.util.stream.Stream;

public class StreamAPIWithNumbers {

	public static void main(String[] args) {
		Integer abc[]= {1,2,3,4,5,6,7,8,9,10}; //array variable
		//Stream.of(abc);  //converted array into stream 
		//display all array variables using stream with the help of forEach method
		//Stream.of(abc).forEach(v->System.out.print(v+" "));
		
		//display only even numbers with filter and forEach
		//Stream.of(abc).filter(f->f%2==0).forEach(v->System.out.print(v+" "));
		
		//display only odd numbers with filter and forEach
		//Stream.of(abc).filter(f->f%2!=0).forEach(v->System.out.print(v+" "));
		
		//some other terminal operator anyMatch
		//boolean result1=Stream.of(abc).anyMatch(v->v>10);
		//System.out.println(result1);
		
		//some other terminal operator allMatch
		//boolean result1=Stream.of(abc).allMatch(v->v>0);
		//System.out.println(result1);
		
	}

}
