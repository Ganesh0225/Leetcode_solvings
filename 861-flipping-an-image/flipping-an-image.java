class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length/2;j++){
                int k=image[i].length-j-1;
                int t=image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=t;
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==0) image[i][j]=1;
                else image[i][j]=0;
            }
        }
        return image;

        // for (int i = 0; i < image.length; i++) {
        //     int left = 0;
        //     int right = image[i].length - 1;
        //     while (left <= right) {
        //         int temp = image[i][left] ^ 1;
        //         image[i][left] = image[i][right] ^ 1;
        //         image[i][right] = temp;
        //         left++;
        //         right--;
        //     }
        // }
        // return image;

    }
}