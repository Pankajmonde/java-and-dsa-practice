package String;

public class FrequencyofChar {

    public static void main(String[] args) {

        String s = "abababdz";

        int freq[] = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println((char) (i + 97) + "-" + freq[i]);
            }
        }

        // String s="hello";
        // int arr[]={1,2,3,1,2};
        // //find max
        // int max=arr[0];
        // for(int ele: arr){
        //     max=Math.max(ele, max);
        // }
        // int freq[]=new int[max+1];
        // for(int ele : arr){
        //     freq[ele]++;
        // }
        // for(int i=0; i<freq.length; i++){
        //     if(freq[i] !=0)
        //     System.out.println(i + " - "+ freq[i]);
        // }
        // System.out.println(Arrays.toString(freq));
    }

}
