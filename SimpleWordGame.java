public class SimpleWordGame {
    public int points(String[] player,
                      String[] dictionary) {
        int product = 1;
        int finalsum = 0;
        int count=0;
        for (int j = 0; j < dictionary.length; j += 1) {
            for (int i = 0; i < player.length; i += 1) {
                if (dictionary[j].equals(player[i])) {
                    count+=1;
                    if (count==1)
                    {
                        product = player[i].length() * player[i].length();
                        finalsum += product;
                    }
                }
            }
            count=0;
        }
        return finalsum;
    }
}