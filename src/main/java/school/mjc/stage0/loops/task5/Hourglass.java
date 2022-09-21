package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int l=height;
        for (int i =0;i<height;i++){

            for (int j=0;j<height;j++){
                if(j>=(height-l)/2 && j<l+(height-l)/2) System.out.print('8');
                else System.out.print(' ');
            }
            if(i<height/2)l-=2;
            else l+=2;
            if(l==0)l+=2;
            System.out.println();
        }
    }
}
