class NamesOnly
{
	static def file = new File("nameAge.txt")
	
	public static void main(String[] args) 
	{
		
	 def values = file.getText()
	 def vals =  values.split()
	  
		  for(int i = 0; i < vals.length - 1; i = i + 2) {
			  println vals[i]
		  }
	}
}
