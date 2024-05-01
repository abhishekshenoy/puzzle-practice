package org.example;

/**
 * Hello world!
 *
 */
public class CanPlaceFlowers
{


    public static boolean canPlaceFlowers(int[] flower, int n) {
        for(int i =0 ; i< flower.length && n!=0 ;i++){
            if(flower[Math.max(0,i-1)]==0 && flower[Math.min(flower.length-1,i+1)]==0 && flower[i]!=1){
                flower[i]=1;
                n--;
            }
        }
        return n <= 0;
    }

    public static void main( String[] args )
    {

        System.out.println(canPlaceFlowers(new int[] {1,0,0,0,1},1));
        System.out.println(canPlaceFlowers(new int[] {1,0,1,0,1},1));
        System.out.println(canPlaceFlowers(new int[] {0,0,0,0,0,0,0,0,0},6));
    }
}
