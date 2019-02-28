//Addtion and subtraction of matrices
#include <stdio.h>

int main(){
        int r,c,i,j,first[10][10],second[10][10],sum[10][10];
        printf("Enter num of rows: ");
        scanf("%d",&r);
        printf("Enter num of col: ");
        scanf("%d",&c);
        printf("Enter the elements of first matrix: \n");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                scanf("%d",&first[i][j]);
            }
        }
        printf("Enter the elements of second matrix: \n");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                scanf("%d",&second[i][j]);
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
        printf("Addtion Two Matrices: \n");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                printf("%d ",sum[i][j]);
            }
            printf("\n");
        }
         for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                sum[i][j] = first[i][j] - second[i][j];
            }
        }
        printf("Subtraction Two Matrices: \n");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                printf("%d ",sum[i][j]);
            }
            printf("\n");
        }
        

    return 0;
}