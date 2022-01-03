package Assignments;

public class Assignment5 {

            public static void main(String[] args) {
                
                int [] arr = {67,5,81,0,7,8};
                System.out.println(largestInArray(arr));
                
            }
        
            static int largestInArray(int [] a) {
                    int max = a[0];
                    for(int i=1;i<a.length;i++) {
                        if(a[i] > max) {
                            max = a[i];
                        }
                    }
                    return max;
            }
      }