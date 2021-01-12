

public class opg5_40{
    public static void main(String[] args) {
        int heads,tales,coin;
        heads = tales = 0;

        for(int i = 0; i<2000000; i++){
            coin = (int)(Math.random()*2) == 0 ? heads++ : tales++;
        }

        System.out.println("Heads: " + heads+
                            "\nTales: " + tales);
    }



}
