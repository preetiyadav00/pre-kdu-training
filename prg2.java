import java.util.*;

class prg2
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner (System.in);
        ArrayList<String> str=new ArrayList<String>();
        HashSet<String> set=new HashSet<>();
        HashMap<String,Integer>mp=new HashMap<>();

        String s;
        for(int i=0;i<10;i++)
        {
            s=sc.nextLine();
            str.add(s);
            set.add(s);
            if(mp.containsKey(s))
            {
                mp.put(s,mp.get(s)+1);
            }
            else
            {
                mp.put(s,1);
            }
        }

        System.out.println("List Contains:");
        for(int i=0;i<str.size();i++)
        {
            System.out.println(str.get(i));
        }

        System.out.println("Set Contains:");
        for(String ele:set)
        {
            System.out.println(ele);
        }
        
        System.out.println("Frequency of the words:");
        for(Map.Entry<String,Integer> entry: mp.entrySet())
        {
            System.out.println("Word = " + entry.getKey() + ", Frequency = " + entry.getValue());
        }

        sc.close();
	}
}