//Determinant of a 2x2 matrix
#include <stdio.h>
#define s 2

int main(){
    int i,det=0,j,a[s][s];
    printf("Enter the elements into 2x2 matrix: \n");
    for(i=0;i<s;i++){
        for(j=0;j<s;j++){
            scanf("%d",&a[i][j]);
        }
    }
    printf("\nMatrix: \n");
    for(i=0;i<s;i++){
        for(j=0;j<s;j++){
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }

    det = a[0][0]*a[1][1] - a[1][0]*a[0][1];
    printf("\nDeterminent: %d\n",det);
    

    return 0;
}