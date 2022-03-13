
public class main  {
	 interface PersonalFunc<T> {
		 int func (T[] vals, T v);
		 }

		static <T> int countMatching(T[] vals, T v) {
			int counter=0;
			for(T x:vals){
				if(x==v)
					counter++;
			}
			return counter;
		}
		static <X> int myOp(PersonalFunc<X> f, X[] vals, X v) {
			return f.func(vals, v);
		}
		
		
		 
	public static void main(String[] args) {
		Integer[] vals= {1,2,3,4,5,6,7,8,9};
		String [] strs= {"Один", "Два","Три"};
		int count;
		count =myOp(main::<Integer>countMatching,vals,5);
		System.out.println("iNTEGER COUNTER: "+count);
		count=myOp(main::<String>countMatching,strs,"jsd");
		System.out.println("Str counter: " +count);
		
		
	}


}
