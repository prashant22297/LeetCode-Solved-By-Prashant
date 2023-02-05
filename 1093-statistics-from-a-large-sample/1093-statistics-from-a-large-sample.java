class Solution {
    public double[] sampleStats(int[] count) {
        double[] ans = new double[5];
        int n=0,max_count=0,max_ele=0;
        double min = 256, max = 0, mean = 0, median=0,mode=0;
        for(int i=0;i<256;i++){
            if(count[i]!=0) n+=count[i];
            if(count[i]>0 && i<min)
                min =i;
            if(count[i]>0 && i>max)
                max=i;
            if(max_count<count[i]){
                max_count =count[i];
                max_ele=i;
            }
            mean+=1.0*count[i]*i;
        }
        ans[0]=min;
        ans[1]=max;
        ans[2]=mean/n;
        System.out.print(n);
        boolean even = false;
        int mid = n/2,temp=0;
        median =0;
        if(n%2==0) {
            for(int i=0;i<256;i++){
                mid-=count[i];
                if(mid==0){
                    // System.out.print("YES");
                    int j=i+1;
                    while(j<256){
                        if(count[j]!=0){
                            median=(i+j)/2.0;
                            break;
                        }
                        j++;
                    }
                    // median= (i+j)/2;
                }
                if(median!=0) break;
                if(mid<0){
                    median=(i+i)/2.0;
                    break;
                }
            }
        }
        else {
            for(int i=0;i<256;i++){
                mid-=count[i];
                if(mid==0){
                    int j=i+1;
                    while(j<256){
                        if(count[j]!=0){
                            median=j;
                            break;
                        }
                        j++;
                    }
                }
                if(mid<0){
                    median=i;
                    break;
                }
            }
        }
        System.out.print(median);
        ans[3]=median;
        ans[4]=max_ele;
        return ans;
    }
}