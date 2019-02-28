//Sparse Matrix in c
#include <stdio.h>
#define s 10

int main(){
        int r,c,i,j,a[s][s],total=0;
        printf("Enter the size of the matrix: MxN\n");
        scanf("%d %d",&r,&c);
        printf("\nEnter the Elements into Matrix: \n");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                scanf("%d",&a[i][j]);
            }
        }

        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
               if(a[i][j]==0){
                   total++;
               }
            }
        }

        if(total >= (r*c)/2){
            printf("This is a Sparse Matrix\n");
        }else{
            printf("This is NOT a Sparse Matrix\n");
        }

}