public class PairDown {
    public  int[] fold(int[] list) {
        int[] result; int arrayindex = 0;
        if(list.length % 2 == 0)
        {
            result = new int[list.length/2];
            for (int i = 0; i < list.length; i += 2)
            {
                result[arrayindex] = list[i] + list[i+1];
                arrayindex++;
            }
        }
        else
        {
            arrayindex=0;
            result = new int[list.length/2+1];
            for (int i = 0; i <list.length; i += 1)
            {
                if (i==(list.length-1))
                {
                    result[arrayindex]=list[i];
                }
                else if (i%2==0) {
                    result[arrayindex] = list[i] + list[i + 1];
                    arrayindex++;
                }
            }
        }
        return result;
    }
}