package net.bishnu.leetcode.sentenceScreenFitting;

/**
 * Created by karlb on 2017-03-26.
 */
public class SentenceScreenFitting {
    public int wordsTyping(String[] sentence, int rows, int cols){
        int size = sentence.length;
        int[] wordCounters = new int[size];

        for(int i=0,len=0,prev=0, counter=0; i<size; i++){
            if(i!=0 && len!=0)  {
                len=cols-(sentence[i-1].length()+1);
                counter--;
            }

            while(len+sentence[(prev+counter)%size].length()<=cols){
                len+=sentence[(prev+counter++)%size].length()+1;
            }
            wordCounters[i] = counter;
            prev += counter;
        }
        int count = 0;
        for(int i=0, k=0; i<rows; i++){
            count += wordCounters[count % size];
        }
        return count/size;
    }
}
