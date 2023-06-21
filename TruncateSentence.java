class Solution {
    public String truncateSentence(String a, int k) {
        String b="";
		
		String aim[]=a.split(" ");
		for(int i=0;i<k;i++)
		{
			b=b+aim[i];
			if(i<k-1)
			{
				b=b+" ";
			}
		}

        return b;
    }
}